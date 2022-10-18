import javax.swing.JFrame;
public class HurricaneDodge {

    public static GameManger mygame;
public static void main(String[] args) {
JFrame frame = new JFrame("Test");
frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
frame.setVisible(true);
frame.setSize(800, 800);
 mygame = new GameManger();
frame.add( new GameManger() );

}
}