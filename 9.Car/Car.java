import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;


class DrCar extends JComponent {
    public void paint(Graphics g) {

        // amking Top-Side of the car        
        g.fillRect(138,197,105,50);
        g.fillArc(233,193,50,50,134,180);
        g.fillArc(110,195,80,80,100,185);
        

        // windows of the car!
        g.setColor(java.awt.Color.white);
        g.fillRect(142,205, 30, 30);
        g.fillRect(182,205, 30, 30);
        g.fillArc(228,198,50,50,134,140);
        g.fillRect(222, 205, 13, 27);
     

        // Body of car
        g.setColor(java.awt.Color.red);
        g.fillRect(110, 230, 190, 50);


        //  Spaces Tyres Detail and Road 
        g.setColor(java.awt.Color.white);
        g.fillArc(120, 250, 55, 55, 55, 360);
        g.fillArc(230, 250, 55, 55, 55, 360);

        g.setColor(java.awt.Color.black);
        g.fillArc(122, 252, 50, 50, 50, 360);
        g.fillArc(232, 252, 50, 50, 50, 360);

        g.setColor(java.awt.Color.gray);
        g.fillArc(127, 257, 40, 40, 40, 360);
        g.fillArc(237, 257, 40, 40, 40, 360);
        g.drawLine(0, 303, 1000, 303);

  
       
    }
}

public class Car {
    public static void main(String[] args) {
        JFrame win = new JFrame("Modern Car Design By Nikhil");
        win.setVisible(true);
        win.setSize(400, 500);
        win.setLocation(850, 50);
        win.setDefaultCloseOperation(3);

        win.getContentPane().add(new DrCar());
    }
}
 