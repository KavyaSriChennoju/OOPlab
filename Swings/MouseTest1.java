import  java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTest1 extends Applet
 { 

        public void init()
          {
            setBackground(Color.blue);
              addMouseListener(new MouseAdapter()
	{
                      public void mouseReleased(MouseEvent me)
                      {
                     Graphics g=getGraphics();
    	g.setColor(Color.red);
	g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
	g.drawString("*",me.getX(),me.getY());

                      }  
               });

      }

/*<applet code="MouseTest1" height=400 width=100></applet>*/


 }


