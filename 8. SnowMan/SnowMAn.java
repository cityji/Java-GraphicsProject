import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;;

class DrawSnowMan extends JComponent {
    public void paint(Graphics g) {
        g.fillPolygon(new int[] { 160, 100, 50 }, new int[] { 200, 100, 200 }, 3);
        // g.setColor(java.awt.Color.Color(23,199,0));
        g.fillPolygon(new int[] { 150, 80, 50 }, new int[] { 250, 90, 250 }, 3);
        g.setColor(java.awt.Color.green);
        g.fillPolygon(new int[] { 150, 80, 50 }, new int[] { 200, 80, 200 }, 3);
    }
}

public class SnowMAn {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setVisible(true);
        w.setSize(400, 500);
        w.setTitle("Project SnowMan by Nik");

        w.setLocation(800, 50);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        w.getContentPane().add(new DrawSnowMan());
    }
}
