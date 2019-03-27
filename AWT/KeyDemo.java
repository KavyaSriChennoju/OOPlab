import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements  KeyListener
{
  private TextField tf;
  
   public KeyDemo()
    {
	 tf=new TextField("bdps");
	 tf.addKeyListener(this);
	 add(tf,BorderLayout.NORTH);
	 setSize(300,300);
	 setVisible(true);
	}
	 public void keyReleased(KeyEvent te)
	  {
	   System.out.println("Key Released");
	   System.out.println("Key code.."+te.getKeyCode());
	   System.out.println("Key TExt ..."+KeyEvent.getKeyText(te.getKeyCode()));
	  }
	  public void keyPressed(KeyEvent ke)
	  {
	  System.out.println("Key Presed  ");
	  }

	  public void keyTyped(KeyEvent ke)
	   {
	   System.out.println("KeyTyped");
	    System.out.println("Key char..."+ke.getKeyChar());
	   }
	  public static void main(String args[])
	   {
	    KeyDemo td=new KeyDemo();
	   }
}	   
	   
	   
