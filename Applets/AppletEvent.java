import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

 public class AppletEvent extends Applet implements ActionListener
{
   private TextField tf;

   private String str;

    public void init()
      {
	tf=new TextField(30);
	str=new String();
	tf.addActionListener(this);
	add(tf,BorderLayout.NORTH);
    }
  public void actionPerformed(ActionEvent ae)
   {
	str=tf.getText();
	repaint();
   }
   public void paint(Graphics g)
       {
	g.setColor(Color.red);
	g.setFont(new Font("serief",Font.BOLD,30));
	g.drawString(str,80,90);
      }
}
