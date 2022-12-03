
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class DrSnow extends JComponent{
    public void paint(Graphics g){
        // g.drawLine(0,50,500,50);
        // start-left start-top length, top-left
        
g.drawLine(100,100,400,100);
g.drawLine(100,300,400,300);
        g.setColor(java.awt.Color.red);

g.drawLine(100,100,100,400);
g.drawLine(400,100,400,400);

    //    g.drawLine();
        // start-left start-top end-left, length
        // if you're drawing to to bottom straight line 
        // the start-left and end-left will always be the same
       
    }
}

class DrawLine{
    public static void main(String[] args) {
        JFrame w =  new JFrame("Test Program");

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        w.setSize(500,500);
        
        w.getContentPane().add(new DrSnow());
    }
}