import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class DrawSmile extends JComponent {
    public void paint(Graphics g) {

        // Oval for face outline
        g.drawOval(80, 70, 150, 150);

        // Ovals for eyes
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        // Arc for the smile
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}

public class Smile {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(342, 371, 342,371);
        window.setVisible(true);
window.setTitle("Smile Emoji");
        // drawing components
        window.getContentPane().add(new DrawSmile());

    }
}