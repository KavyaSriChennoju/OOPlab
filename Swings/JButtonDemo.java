import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo extends JFrame implements ActionListener
{
 private JButton jb1,jb2,jb3;

  public JButtonDemo()
   {
  setTitle("JButton with Icon demo");
    jb1=new JButton("Home",new ImageIcon("images\\home-icon.png"));
    jb2=new JButton(new ImageIcon("images\\delete.png"));
jb3=new JButton("Download",new ImageIcon("images\\download.png"));

	jb3.setEnabled(false);

	jb1.setMnemonic(KeyEvent.VK_H);
	jb2.setMnemonic(KeyEvent.VK_M);
	jb3.setMnemonic(KeyEvent.VK_D);

	jb1.setToolTipText("Button String and Icon");
	jb2.setToolTipText("Only Icon");
	jb3.setToolTipText("Only String");

	jb1.addActionListener(this);
	jb3.addActionListener(this);

	JPanel jp=new JPanel();
	jp.add(jb1);jp.add(jb2);jp.add(jb3);

setDefaultCloseOperation(EXIT_ON_CLOSE);
	 getContentPane().add(jp,"North");
	 setSize(300,200);
      setVisible(true);
	}

public void actionPerformed(ActionEvent ae)
	 {
 JButton jb=(JButton)ae.getSource();
	   if(jb==jb1)
	    {
		  jb1.setEnabled(false);
		  jb2.setEnabled(false);
		  jb3.setEnabled(true);
		 }
		 else
		  {
		    jb3.setEnabled(false);
	   	   jb2.setEnabled(true);
		 jb1.setEnabled(true);
		  }
	}
public static void main(String args[])
	 {
	  JButtonDemo jbd=new JButtonDemo();
	 }
}


