import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.colorchooser.ColorSelectionModel;

class DrawCircle extends JComponent{
    public void paint (Graphics g){

        // draw Strings below ballons
        g.drawLine(75, 120, 90, 220);
        g.drawLine(95, 120, 90, 220);
        g.drawLine(115, 120, 90, 220);

        // draw different ballons using differentcolors
        g.setColor(java.awt.Color.red);
        g.fillOval(50, 10, 50, 110);
        g.setColor(java.awt.Color.blue);
        g.fillOval(70, 10, 50, 110);
        g.setColor(java.awt.Color.green);
        g.fillOval(90, 10, 50, 110);
    }
}



public class Baloons {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(400,400,400,400);
        window.setVisible(true);
        
        // drawing components

        window.getContentPane().add(new DrawCircle());

    }
}