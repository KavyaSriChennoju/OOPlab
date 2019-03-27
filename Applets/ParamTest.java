import java.io.*;
import java.awt.*;
import java.applet.*;

 public class ParamTest extends Applet
 {
     private String str1,str2;

   public void paint(Graphics g)
    {
         str1=getParameter("company");
         str2=getParameter("caption");

      g.setColor(Color.red);
      g.setFont(new Font("Arial Black",Font.BOLD,20));
      g.drawString("Company is.."+str1,20,50);

      g.setColor(Color.blue);
      g.setFont(new Font("serif",Font.BOLD,20));
      g.drawString("caption is.."+str2,20,90);
     }
}


