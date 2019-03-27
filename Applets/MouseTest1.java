import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTest1 extends Applet
 {
 Color bh[]={Color.red,Color.green,Color.pink,Color.yellow};

      int i=0;
      int x,y;

       public void init()
          {
   setBackground(Color.blue);
   addMouseListener(new MouseAdapter()
	{
    public void mouseReleased(MouseEvent me)
    {
    Graphics g=getGraphics();
	g.setColor(bh[i]);
	g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
                   
	x=me.getX();
	     y=me.getY();

	g.drawString("Mehaboob",x,y);
showStatus("X: "+String.valueOf(x)+" Y:" +String.valueOf(y));
          if(i==3)
	       i=0;
             else
                  i++;
                      }
               });
      }
 }