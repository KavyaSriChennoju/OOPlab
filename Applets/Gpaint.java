import java.io.*;
import java.awt.*;
import java.applet.*;

public class Gpaint extends Applet
 {
    private GradientPaint gp;
    public void init()
      {
	gp=new GradientPaint(0.5f,0.4f,Color.red,45.4f,45.4f,Color.blue,true);
      }
     public void paint(Graphics g)
       {
	Graphics2D g2=(Graphics2D)g;
	g2.setPaint(gp);
	g2.fill(new Rectangle(50,50,100,100));
	g2.fillOval(180,50,150,100);
         }
}


