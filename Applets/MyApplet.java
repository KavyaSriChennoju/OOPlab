import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
  private String message;
  public void printMessage(String str)
  {
    message=str;
    repaint();
  }

  public void paint(Graphics g)
   {
    g.setColor(Color.red);
    g.setFont(new Font("Arial",Font.BOLD,20));
    g.drawString(message,50,50);
   }
}
     





