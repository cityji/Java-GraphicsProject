import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

class DrawH extends JComponent {
    public void paint(Graphics g) {
        g.drawLine(200, 100, 200, 220);
        g.drawLine(100,160,200,160);
        g.drawLine(100, 100, 100, 220);
    }
}

public class H {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setBounds(400, 400, 400, 400);
        w.setVisible(true);

w.getContentPane().add(new DrawH());
    }
}