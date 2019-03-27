/*
JOptionPane makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something.

While the JOptionPane class may appear complex because of the large number of methods, almost all uses of this class are one-line calls to one of the static showXxxDialog methods shown below:

Method Name 			Description
------------------     ----------------
showConfirmDialog 		Asks a confirming question, 	like				yes/no/cancel.

showInputDialog 			Prompt for some input.

showMessageDialog 	Tell the user about something that has 	happened.

showOptionDialog 	The Grand Unification of the above three.


messageType:
			ERROR_MESSAGE
			INFORMATION_MESSAGE
			WARNING_MESSAGE
			QUESTION_MESSAGE
			PLAIN_MESSAGE
optionType:
			DEFAULT_OPTION
			YES_NO_OPTION
			YES_NO_CANCEL_OPTION
			OK_CANCEL_OPTION

When one of the showXxxDialog methods returns an integer, the possible values are:
	YES_OPTION
	NO_OPTION
	CANCEL_OPTION
	OK_OPTION
	CLOSED_OPTION
*/

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneDemo extends JFrame implements ActionListener
{
  private JButton message,input,confirm;

  public OptionPaneDemo()
   {
     setTitle("JOptionPane Demo");
     message=new JButton("Message Dialog");
     confirm=new JButton("confirm Dialog");
     input=new JButton("Input Dialog");

         message.addActionListener(this);
         input.addActionListener(this);
         confirm.addActionListener(this);

   JPanel jp=new JPanel();
 jp.add(message); jp.add(input);jp.add(confirm);

          getContentPane().add(jp,"North");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
          setSize(500,200);
          setVisible(true);
    }
public void actionPerformed(ActionEvent ae)
     {
      JButton jb=(JButton)ae.getSource();
       if(jb==message)
	   JOptionPane.showMessageDialog(OptionPaneDemo.this,"Welcome to JOption Page","This is Message Dialog",JOptionPane.ERROR_MESSAGE,new ImageIcon("images/delete.png"));

       if(jb==confirm)
        JOptionPane.showConfirmDialog(OptionPaneDemo.this,"Do u want to Continue","confirm",JOptionPane.YES_NO_CANCEL_OPTION);
       if(jb==input)
       {
	    try
		{
String str=JOptionPane.showInputDialog("Input Any Value");
         if(!str.equals(""))
      JOptionPane.showMessageDialog(OptionPaneDemo.this,str);

		}catch(Exception e)
		 {
		    JOptionPane.showMessageDialog(OptionPaneDemo.this,"<html><body><font color='red'>Null Exception</font></body></html>");
	
		 }
	  }
   }
   public static void main(String args[])
      {
        OptionPaneDemo opt=new OptionPaneDemo();
      }
  }
