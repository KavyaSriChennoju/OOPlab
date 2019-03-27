import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WindowDemo1 extends Frame implements WindowListener
{
   public WindowDemo1()
     {
    addWindowListener(this);
	setSize(300,300);
	setVisible(true);
     }
public void windowActivated(WindowEvent we)
         {
   System.out.println("Window is Activated");
         }
public void windowDeactivated(WindowEvent we)
          {
System.out.println("deactivated");
          }
    public void windowClosed(WindowEvent we)
            {

            }
public void windowClosing(WindowEvent we)
              {
        System.exit(0);
              }
public void windowIconified(WindowEvent we)
              {
   System.out.println("minimized");
               }
 public void windowDeiconified(WindowEvent we)
              {
               }
   public void windowOpened(WindowEvent we)
               {
       System.out.println("Window Opened");
               }

     public static void main(String args[])
            {
        WindowDemo1 wd=new WindowDemo1();
           }
}

