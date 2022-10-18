import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GameManger extends JComponent implements MouseListener, Runnable {
    private Player play;
    private ArrayList<Hurricane> hurrList;
    private int timer = 0;

    public ArrayList<Projectile> duckList;
    public GameManger() {
        play = new Player(400, 400);
        hurrList = new ArrayList<Hurricane>();
        duckList = new ArrayList<Projectile>();
        hurrList.add(new Hurricane(100, 100, 20));
        hurrList.add(new Hurricane(700, 100, 50));
        this.addMouseListener(this);
        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        play.draw(g);
        for (Hurricane h : hurrList) {
            h.draw(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        play.setTarget(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }

@Override
public void run() {
while (true) {
try {
timer++;
play.update();
for (int i=0; i<hurrList.size(); i++) {
hurrList.get(i).update();
if (play.doesHit(hurrList.get(i))) {
System.out.println("You got hit by a hurricane");
hurrList.remove(i);
i--;
}
}
if (timer > 100) {
hurrList.add(new Hurricane ((int) (Math.random()* 
800),  
(int) (Math.random()* 800), (int) 
(Math.random()* 100)));
timer = 0;
}
repaint();
Thread.sleep(20);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}
