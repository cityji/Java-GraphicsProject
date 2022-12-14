import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class DrDoremon extends JComponent{
    public void paint(Graphics g){
        g.drawString("Java Swing", 235, 50);
        g.setColor(Color.white);
        g.fillOval(204,405,65,40);
        g.setColor(Color.black);
        g.drawOval(204,405,65,40);
        g.setColor(Color.white);
        g.fillOval(282,405,65,40);
        g.setColor(Color.black);
        g.drawOval(282,405,65,40);
        int x[]={200,350,400,420,348,340,290,275,260,210,218,188,168};
        int y[]={250,250,200,220,300,420,420,380,420,420,310,360,340};
        g.setColor(Color.blue);
        g.fillPolygon(x,y,13);
        g.setColor(Color.blue);
        g.fillPolygon(x,y,13);
        g.setColor(Color.white);
        g.fillOval(223,240,115,125);
        g.setColor(Color.black);
        g.drawOval(223,240,115,125);
        g.drawLine(240,310,320,310);
        g.drawArc(240,270,80,80,180,180);
        g.setColor(Color.CYAN);
        g.fillOval(170,85,210,180);
        g.setColor(Color.black);
        g.drawOval(170,85,210,180);
        g.setColor(Color.WHITE);
        g.fillOval(188,125,175,135);
        g.setColor(Color.black);
        g.drawOval(188,125,175,135);
        g.setColor(Color.black);
        g.drawLine(230,198,325,200);
        g.drawArc(230,155,95,87,180,180);
        g.setColor(Color.black);
        g.fillArc(230,155,95,87,180,180);
        g.setColor(Color.black);
        g.drawArc(255,214,50,40,-170,-170);
        g.setColor(Color.orange);
        g.fillArc(255,214,50,40,-170,-190);
        g.fillArc(255,227,48,15,180,180);
        g.setColor(Color.white);
        g.fillOval(232,100,45,60);
        g.setColor(Color.black);
        g.drawOval(232,100,45,60);
        g.setColor(Color.white);
        g.fillOval(278,100,45,60);
        g.setColor(Color.black);
        g.drawOval(278,100,45,60);
        g.setColor(Color.black);
        g.fillOval(255,125,14,24);
        g.setColor(Color.black);
        g.fillOval(285,125,14,24);
        g.setColor(Color.white);
        g.fillOval(259,135,7,7);
        g.setColor(Color.white);
        g.fillOval(288,135,7,7);
        g.setColor(Color.RED);
        g.fillOval(260,148,34,34);
        g.setColor(Color.black);
        g.drawOval(260,148,34,34);
        g.setColor(Color.white);
        g.fillOval(265,158,10,10);
        g.setColor(Color.black);
        g.drawOval(265,158,10,10);
        g.drawLine(278,181,278,198);
        g.drawLine(310,170,368,150);
        g.drawLine(310,180,368,180);
        g.drawLine(310,190,368,210);
        g.drawLine(240,170,188,150);
        g.drawLine(240,180,188,180);
        g.drawLine(240,190,188,210);
        g.setColor(Color.red);
        g.fillRect(215,248,120,15);
        g.setColor(Color.black);
        g.drawRect(215,248,120,15);
        g.setColor(Color.yellow);
        g.fillOval(260,250,40,40);
        g.setColor(Color.black);
        g.drawOval(260,250,40,40);
        g.setColor(Color.black);
        g.fillOval(274,270,10,10);
        g.setColor(Color.black);
        g.drawArc(253,265,50,20,30,100);
        g.setColor(Color.white);
        g.fillOval(158,330,40,40);
        g.setColor(Color.black);
        g.drawOval(158,330,40,40);
        g.setColor(Color.white);
        g.fillOval(390,190,40,40);
        g.setColor(Color.black);
        g.drawOval(390,190,40,40);
    }
}

class DoreMon{
    public static void main(String[] args) {
        JFrame w = new JFrame("Try Me!");
        w.setVisible(true);
        w.setSize(550,500);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.getContentPane().add(new DrDoremon());
    }
}