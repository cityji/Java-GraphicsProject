import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class DrawI extends JComponent{
    public void paint(Graphics g){

        g.drawLine(100,100,310,100);
        g.drawLine(200,100,200,220);
        g.drawLine(100, 220, 310, 220);
        //          x1   y1   x2  y2
              //    lST  ro  lEn  ro
            //   length start 
            // roundover 
            // lengthEnd 
    }
}

public class I {
    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setBounds(200,200,400,400);
        w.setVisible(true);

        w.getContentPane().add(new DrawI());
    }
}
