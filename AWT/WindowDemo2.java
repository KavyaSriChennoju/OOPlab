import  java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WindowDemo2 extends Frame
 {
    public WindowDemo2()
     {
        addWindowListener(new MyWindowListener());
        setSize(300,300);
        setVisible(true);
      }
    public static void main(String args[])
       {
         WindowDemo2 win=new  WindowDemo2();
       }
}

 class MyWindowListener extends WindowAdapter
 {
  public void windowClosing(WindowEvent we)
       {
            System.exit(0);
       }
public void windowActivated(WindowEvent we)
       {
     System.out.println("Window is activated");
      }
}
