import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WindowFocusDemo extends Frame implements WindowFocusListener
{
  public WindowFocusDemo()
  {
    addWindowFocusListener(this);
	setSize(200,200);
	show();
  }
  public void windowGainedFocus(WindowEvent we)
   {
    System.out.println("window Gained the focus  ");
	 
	} 
	public void windowLostFocus(WindowEvent we)
	 {
	  System.out.println("Window lost focus  ");
	  setState(Frame.ICONIFIED);
	 } 
  public static void main(String args[])
   {
    WindowFocusDemo wsd=new WindowFocusDemo();
   }
 }  
   