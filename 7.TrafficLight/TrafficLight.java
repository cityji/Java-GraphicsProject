import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class DrTraffic extends JComponent {
    public void paint(Graphics g) {
        // printing advisory
        g.drawString("Please Follow Traffic Rules", 120, 20);
        g.drawLine(50, 30, 350, 30);

        // drawing Traffic Lights
        g.drawRect(160, 60, 60, 160);
        g.drawRect(180, 220, 20, 160);

        g.setColor(java.awt.Color.red);
        g.fillOval(175, 84, 30, 30);
        g.setColor(java.awt.Color.orange);
        g.fillOval(175, 127, 30, 30);
        g.setColor(java.awt.Color.green);
        g.fillOval(175, 170, 30, 30);

    }
}

public class TrafficLight {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setVisible(true);
        w.setSize(400, 500);
        w.setLocation(800, 40);
        w.setTitle("Project TrafficLight by Nik");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        w.getContentPane().add(new DrTraffic());
    }
}