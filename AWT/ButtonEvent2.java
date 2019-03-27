import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent2 extends Frame implements ActionListener
 {
  Button button1,button2;
   public ButtonEvent2()
    {
	 button1=new Button("Button1");
	 button1.addActionListener(this);

	 button2=new Button("Button2");
	 button2.addActionListener(this);

	 add(button1,BorderLayout.NORTH);
	 add(button2,BorderLayout.SOUTH);
	 setSize(300,200);
	 setVisible(true);
	 }
public void actionPerformed(ActionEvent ae)
	   {
//System.out.println("Button  was pressed");


Object ob=ae.getSource();
   System.out.println("clicked object.."+ob);
    if(ob==button1)
	  System.out.println("button 1 was pressed");
	 else
	 System.out.println("button 2 was pressed");

     }
  public static void main(String args[])
	    {
	 ButtonEvent2 bet=new ButtonEvent2();
	   }
}

