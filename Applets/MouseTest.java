import  java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTest extends Applet
 { 
        int x,y;
        public void init()
          {
            setBackground(Color.blue);
     addMouseListener(new MouseAdapter()
	{
      public void mouseReleased(MouseEvent me)
         {
          x=me.getX();	
	      y=me.getY();
	     repaint();
               }  
               });

      }

    public void  paint(Graphics g)
           {
	g.setColor(Color.red);
	g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
	g.drawString("Mehaboob",x,y);
          }

 }


