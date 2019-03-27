import java.io.*;
import java.awt.*;
import java.applet.*;


public class bharat1 extends Applet
{
    private String str="bharat";
    	int x=20;
public void display()
{
          
                    x++;
	if(x>300)                     
	{x=10;  }
	try
 	{
	  Thread.sleep(50);
                    }catch(Exception e)
	{ }
	repaint();
        
}
       public void paint(Graphics g)
  {
                    g.setColor(Color.red);
	g.setFont(new Font("Arial",Font.BOLD,30));
	g.drawString(str,x,30);
	display();
   }
}


