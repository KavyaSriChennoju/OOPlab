/*
A Dialog is a top-level window with a title and a border that is typically used to take some form of input from the user. The size of the dialog includes any area designated for the border. 
*/

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class DialogDemo extends Frame implements ActionListener
{
  private Button but;
  private MyDialog md;
   
   public DialogDemo()
    {
//	md=new MyDialog(this); 
	  but=new Button("Start");
	  but.addActionListener(this);
	  add(but,"North");
	  setSize(300,300);
	  setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	 {
	  md=new MyDialog(this); 
	//	md.setSize(150,150);
	//	md.setVisible(true);
	  }
	 public static void main(String args[])
	  {
	   DialogDemo dd=new DialogDemo();
	  }
}