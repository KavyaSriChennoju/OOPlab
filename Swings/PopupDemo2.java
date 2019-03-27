/*
An implementation of a popup menu -- a small window that pops up and displays a series of choices. A JPopupMenu is used for the menu that appears when the user selects an item on the menu bar. It is also used for "pull-right" menu that appears when the selects a menu item that activates it. Finally, a JPopupMenu can also be used anywhere else you want a menu to appear. For example, when the user right-clicks in a specified area. 


*/
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopupDemo2 extends JFrame 
{
  private JPopupMenu jpm;
    
  public PopupDemo2()
   {
     setTitle("Popup Demo ");
     jpm=new JPopupMenu();
	 jpm.add("javac");
	 jpm.add("java");
	 jpm.add("javap");
	 jpm.addSeparator();
	 jpm.add("javah");
	 
addMouseListener(new MouseAdapter()
	    {
  public void mouseReleased(MouseEvent me)
		   {
		    if(me.isPopupTrigger())
			{
jpm.setLocation(me.getX(),me.getY());
	     jpm.setVisible(true);
			 }
			 else
			 jpm.setVisible(false);
			}
		});   	 
	 setSize(300,300);
	setVisible(true);
	} 
	 public static void main(String args[])
	   {
 PopupDemo2 pd=new PopupDemo2();
		}
}		