import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionTest extends JApplet
{
   public void init()
    {
       addMouseMotionListener(new MouseMotionAdapter()
       {
        public void mouseMoved(MouseEvent me)
        {

         String x,y;
          x=String.valueOf(me.getX());
          y=String.valueOf(me.getY());
          showStatus("Mouse Location is...X="+x+"  Y ="+y);
        }
    });
 }
}


