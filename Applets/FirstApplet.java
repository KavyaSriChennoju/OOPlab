import java.awt.*;
import java.applet.*;


public class FirstApplet extends Applet
{
   public void paint(Graphics g)
       {
	g.setColor(Color.red);
	g.setFont(new Font("serief",Font.BOLD,20));
	g.drawString("Welcome to Java Applet",50,80);
        }
}