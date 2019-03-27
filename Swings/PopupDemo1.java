import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopupDemo1 extends JFrame implements ActionListener
{
  private JPopupMenu jpm;
  private JButton jb;
  public PopupDemo1()
   {
     setTitle("Popup Demo ");
     jpm=new JPopupMenu();
	 jpm.add("javac");
	 jpm.add("java");
	 jpm.add("javap");
	 jpm.addSeparator();
	 jpm.add("javah");
	 
	 jb=new JButton("JDK Commands");
	 jb.addActionListener(this);
	 getContentPane().add(jb,"North");
	 setSize(300,300);
	 show();
	} 
     public void actionPerformed(ActionEvent ae)
	  {
	    jpm.show(this,10,45);
	  }
	  public static void main(String args[])
	   {
	    PopupDemo1 pd=new PopupDemo1();
		}
}		