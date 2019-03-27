import  java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WindowDemo3 extends Frame
 {
    public WindowDemo3()
     {
    addWindowListener(new WindowAdapter() 
      {
  public void windowClosing(WindowEvent we)
          {
               System.exit(0);
            }          
          });
         setSize(300,300);
	setVisible(true);
      }
    public static void main(String args[])
       {
         WindowDemo3 win=new WindowDemo3();
       }
}
