import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WindowStateDemo extends Frame implements WindowStateListener
{
  public WindowStateDemo()
  {
    addWindowStateListener(this);
	setSize(200,200);
	show();
  }
  public void windowStateChanged(WindowEvent we)
   {
    System.out.println("window State was Changed"); 
	 
	} 
  public static void main(String args[])
   {
    WindowStateDemo wsd=new WindowStateDemo();
   }
 }  
   