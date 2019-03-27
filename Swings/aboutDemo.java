import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class aboutDemo extends JFrame implements ActionListener
{
 private JMenuItem about;
 private JMenu menu;
 private mydialog md;
 public aboutDemo()
  {
   md=new mydialog(this);
   about=new JMenuItem("about Me");
   menu=new JMenu("Help");
   menu.add(about);
   JMenuBar jmb=new JMenuBar();
   jmb.add(menu);
   
   about.addActionListener(this);
   setJMenuBar(jmb);
   setSize(300,300);
   show();
   }
   public void actionPerformed(ActionEvent ae)
    {
	   md.show();
	  }
	  
	public static void main(String args[])
	{
	 aboutDemo ab=new aboutDemo();
	 }
}


class mydialog extends JDialog
 {
   private JButton jb;
   mydialog(JFrame f)
    {
	 super(f);
	 jb=new JButton("Close");
	 getContentPane().add(jb);
	 setSize(200,300);
	 }
}	 
   	 
   
   