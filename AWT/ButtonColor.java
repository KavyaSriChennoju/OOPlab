import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonColor extends Frame implements ActionListener
{
   private Button gb,rb,yb;

    public ButtonColor()
    {
         rb=new Button("Red");
         yb=new Button("Yellow");
         gb=new Button("Green");

	Panel p=new Panel();
	p.add(rb);p.add(yb);p.add(gb);
	
	rb.addActionListener(this);
	yb.addActionListener(this);
	gb.addActionListener(this);

                   add(p,BorderLayout.NORTH);
	setBounds(100,100,200,200);
	show();
    }

    public void actionPerformed(ActionEvent ae)
   {
          String command=ae.getActionCommand();
	if(command.equals("Red"))
	   setBackground(Color.red);
	else if(command.equals("Yellow"))
	   setBackground(Color.yellow);
	else
	   setBackground(Color.green);	
  }
  public static void main(String args[])
     {
	ButtonColor bt=new ButtonColor();
    }
}
	