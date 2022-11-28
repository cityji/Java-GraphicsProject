import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

class DFlag extends JComponent {
    public void paint(Graphics g) {
        g.setColor(java.awt.Color.orange);
        g.fillRect(170, 50, 200, 50);
        g.setColor(java.awt.Color.white);
        g.fillRect(170, 100, 200, 50);
        g.setColor(java.awt.Color.green);
        g.fillRect(170, 150, 200, 50);
        g.setColor(java.awt.Color.black);
        // g.drawLine(170, 50, 170, 420);
        g.fillRect(155, 50, 10, 370);

        g.setColor(java.awt.Color.black);
        g.drawOval(240, 100, 50, 50);
        g.drawLine(265, 100, 265, 150);
        g.drawLine(240, 125, 290, 125);
        g.drawLine(280, 107, 250, 143);
        g.drawLine(250, 107, 280, 145);
        g.drawLine(258, 102, 272, 147);
        g.drawLine(273, 102, 258, 147);
        g.drawLine(287, 115, 245, 135);
        g.drawLine(245, 115, 287, 135);
    }
}

public class Flag {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setBounds(500, 500, 500, 500);
        w.setVisible(true);

        w.getContentPane().add(new DFlag());

    }
}
