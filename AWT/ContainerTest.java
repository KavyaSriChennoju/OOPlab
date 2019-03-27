import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class ContainerTest extends Frame implements ContainerListener,ActionListener
{
  private Button b;
  private Panel panel;
  private int i;
  public ContainerTest()
   {
    i=0;
   	b=new Button("new Button");
	panel=new Panel();
	b.addActionListener(this);
	panel.addContainerListener(this);
    add(b,BorderLayout.NORTH);
	add(panel,BorderLayout.SOUTH);
	setBounds(200,200,300,300);
	show();
	}
	public void actionPerformed(ActionEvent ae)
	 {
	  panel.add(new Button("Button .."+String.valueOf(i)));
	  i++;
	  pack();
	 } 
	public void componentAdded(ContainerEvent ce)
	 {
	 	System.out.println("Component Added");
     }
	 public void componentRemoved(ContainerEvent ce1)
	  {
	  
	  }
	  
	  public static void main(String args[])
	   {
	     ContainerTest ct=new ContainerTest();
	   }
	 }  
	   
	   
	   
	