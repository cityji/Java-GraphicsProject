/**
 * This Program is supposed to make in c or cpp because
 * as far as i have understood, floodfill and linefill is not provided by default in java 
 *  and needs to be implimented manually 
 * which i am not comfortable doing as of now 
 * 
 * so ..i guess it's time to move towards DOSBOX xD
 */
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

class DrShape extends JComponent{
    public void paint(Graphics g){
        g.drawLine(100,100, 300, 100);        
        g.drawLine(100,200, 300, 200);
     
        g.drawLine(100, 100, 100, 200);
        g.drawLine(300, 100, 300, 200);
        g.setPaintMode();
        g.

        g.setColor(java.awt.Color.red);
        g.fillArc(170, 120, 50, 50, 50, 360);
    }
}


public class BoundryFill {
    public static void main(String[] args) {
        JFrame w = new JFrame("Fill Methods And Algorithms");
        w.setVisible(true);
        w.setSize(500,500);
        w.setLocation(750, 100);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DRAWING REQUIRED SHAPE
        w.getContentPane().add(new DrShape());
        
        /**
         * seems I made flag of Japan ..
         */
    }
}
