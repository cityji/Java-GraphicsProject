import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class DrTraffic extends JComponent {
    public void paint(Graphics g) {
        // printing advisory
        g.drawString("Please Follow Traffic Rules", 120, 20);
        g.drawLine(50, 30, 350, 30);

        // drawing Traffic Lights
        g.fillRect(157, 57, 65, 165);
        g.setColor(java.awt.Color.gray);
        g.fillRect(160, 60, 60, 160);
        
        // dandi 
        g.setColor(java.awt.Color.black);
        g.fillRect(177, 220, 23, 163);
        g.setColor(java.awt.Color.gray);
        g.fillRect(180, 222, 18, 158);
        

        // Lights
        g.setColor(java.awt.Color.red);
        g.fillOval(175, 84, 30, 30);
        g.setColor(java.awt.Color.orange);
        g.fillOval(175, 127, 30, 30);
        g.setColor(java.awt.Color.green);
        g.fillOval(175, 170, 30, 30);
        
        // road
        g.setColor(java.awt.Color.black);
        g.fillRect(0, 382, 500, 3);
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setVisible(true);
        w.setSize(400, 500);
        w.setLocation(800, 40);
        w.setTitle("Project TrafficLight by Nik");
        w.setDefaultCloseOperation(3);
        w.getContentPane().add(new DrTraffic());
    }
}