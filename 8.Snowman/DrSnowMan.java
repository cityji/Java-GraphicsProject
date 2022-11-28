import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class DrSnow extends JComponent {

  public void paint(Graphics g) {
    // hands
    g.setColor(java.awt.Color.black);
    g.fillOval(20, 230, 120, 10);
    g.fillOval(180, 230, 120, 10);

    // drawing chest and scaff
    g.setColor(java.awt.Color.lightGray);
    g.fillOval(95, 200, 115, 115);
    g.setColor(java.awt.Color.orange);
    g.fillOval(110, 120, 80, 100);
    // tie
    g.fillOval(150, 210, 30, 80);
    g.setColor(java.awt.Color.lightGray);

    // drawing snowman
    g.fillOval(100, 110, 100, 100);
    g.fillOval(80, 270, 150, 150);

    // hat of snowman
    g.setColor(java.awt.Color.red);
    g.fillRect(115, 80, 70, 40);
    g.setColor(java.awt.Color.black);
    g.fillRect(105, 110, 90, 10);

    //eyes
    g.drawOval(115, 140, 25, 25);
    g.drawOval(155, 140, 25, 25);
    g.fillOval(122, 145, 13, 13);
    g.fillOval(162, 145, 13, 13);

    // smile
    g.drawLine(160, 180, 157, 199);
    g.drawLine(160, 180, 155, 190);
    g.drawLine(145, 180, 157, 199);
    g.drawLine(145, 180, 155, 190);

    // drawing tree
    g.drawLine(410, 40, 350, 150);
    g.drawLine(410, 40, 470, 150);
    g.drawLine(350, 150, 470, 150);

    g.drawLine(405, 110, 350, 190);
    g.drawLine(405, 110, 470, 190);
    g.drawLine(350, 190, 470, 190);
    g.fillRect(400, 190, 15, 230);

    // final-touch The Ground :)
    g.drawLine(0, 420, 500, 420);
  }
}

class DrSnowMan {

  public static void main(String[] args) {
    JFrame w = new JFrame("Drawing Snow Man by Nik");

    w.setVisible(true);
    w.setSize(500, 500);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // w.setLocation(800, 100);
    w.getContentPane().add(new DrSnow());
  }
}