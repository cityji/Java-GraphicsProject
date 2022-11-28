import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class DrawT extends JComponent{
    public void paint(Graphics g){
        // --- Horizontal line
        g.drawLine(100,100,310,100);
        // | vertical line
        g.drawLine(200,100,200,220);
    }
}

public class T {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setBounds(200,200,400,400);
        w.setVisible(true);

        w.getContentPane().add(new DrawT());
    }
}
