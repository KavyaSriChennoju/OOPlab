import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventT extends Frame implements ActionListener
 {
  Button button1;

  public ButtonEventT()
    {
	 button1=new Button("Button1");
	 button1.addActionListener(this);

	 add(button1,BorderLayout.NORTH);
		 setSize(300,200);
	 setVisible(true);
	 }
public void actionPerformed(ActionEvent ae)
	   {
System.out.println("Button  was pressed");
	  }
  public static void main(String args[])
	    {
	 ButtonEventT bet=new ButtonEventT();
	   }
}

