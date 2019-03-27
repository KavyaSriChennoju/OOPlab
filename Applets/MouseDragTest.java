import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDragTest extends JApplet implements MouseMotionListener
{
  private int x,y;
  private int x1,y1;
   public void init()
    {
       addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent me)
     {

      x=me.getX();
      y=me.getY();

      x1=me.getX();y1=me.getY();

     }

public void paint(Graphics g)
{

g.setColor(Color.red);
g.drawRect(x,y,x1,y1);

}
    public void mouseMoved(MouseEvent me)
    {

     //  Graphics g=getGraphics();
      // g.setColor(Color.red);
       //g.drawRect(x,y,x1,y1);
repaint();
    }

 }

