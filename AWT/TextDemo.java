import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class TextDemo extends Frame implements TextListener
{
  private TextField tf;
  
   public TextDemo()
    {
	 tf=new TextField("bdps");
	 tf.addTextListener(this);
	 add(tf,BorderLayout.NORTH);
	 setSize(300,300);
	 setVisible(true);
	}
public void textValueChanged(TextEvent te)
	  {
	System.out.println("Text is Chnaged ");
	  }
	 public static void main(String args[])
	   {
	    TextDemo td=new TextDemo();
	   }
}	   
	   
	   
