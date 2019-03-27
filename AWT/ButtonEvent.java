import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent extends Frame implements ActionListener
 {
  private Button button;
   public ButtonEvent()
    {
	 button=new Button("start");
 button.addActionListener(this);
	 
	 add(button,BorderLayout.NORTH);
	 setSize(300,200);
	 setVisible(true);
	 }
public void actionPerformed(ActionEvent ae)
	   {
//System.out.println("button was clicked");

	     String str=button.getLabel();
		  if(str.equals("start"))
	        button.setLabel("stop");
		  if(str.equals("stop"))
		    button.setLabel("start");
	   }	 
public static void main(String args[])
    {
	 ButtonEvent bet=new ButtonEvent();
	}
}
		
		