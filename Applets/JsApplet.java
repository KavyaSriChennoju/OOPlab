import java.io.*;
import java.awt.*;
import java.applet.*;


public class JsApplet extends Applet
{
  private String str;
  
   public void DisplayMessage(String message)
    {
	 	str=message;
		repaint();
	}
	
	public void paint(Graphics g)
	 {
	  g.setColor(Color.red);
	  g.setFont(new Font("Serif",Font.BOLD,24));
	  g.drawString(str,50,50);
	}
}	