import java.applet.*;
import java.awt.*;
public class AppletImage extends Applet
{
  private Image img;
  private int width,height;

   public void init()
   {
    img=getImage(getDocumentBase(),"dvd.jpe");
   }

   public void paint(Graphics g)
    {
      Graphics2D g2=(Graphics2D)g;
      g2.setColor(Color.red);
       width=img.getWidth(this);
       height=img.getHeight(this);
        g2.setStroke(new BasicStroke(4.5f));

        g2.drawRect(45,45,width+10,height+10);

        g2.drawImage(img,50,50,this);
    }
 }
