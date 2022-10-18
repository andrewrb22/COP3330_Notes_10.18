import java.awt.Color;

public class Duck extends Projectile {

    double x ,y;
    double vx, vy;


    public Duck( int x, int y, int vx, int vy) {
        super(15);
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
 
    }

    @Override
    public void move() {
     this.x += vx;
     this.x += vy;
        
    }

    @Override
    public void draw() {
     
        g.setColor(Color.YELLOW);
        g.fillRect((int))
    }

    @Override
    public boolean hit(Projectile o) {
     
        return false;
    }
    
}
