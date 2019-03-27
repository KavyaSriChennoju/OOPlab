import java.io.*;
import java.awt.*;
import java.applet.*;

public class AddImage extends Applet
 {
   private Image img;
   int height,width;

   public void init()
    {
img=getImage(getDocumentBase(),"dvd.jpe");
     }

     public void paint(Graphics g)
     {
		 //converting Graphics to Graphics2D
      Graphics2D g2=(Graphics2D)g;
      height=img.getHeight(this);
      width=img.getWidth(this);

      g2.setColor(Color.red);
	 g2.setStroke(new BasicStroke(5.0f));
      g2.drawRect(45,45,width+10,height+10);
      g2.drawImage(img,50,50,this);

      g2.setColor(Color.blue);
	  g2.drawString("Samsung",80,160);
      }
}