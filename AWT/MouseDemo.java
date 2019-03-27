import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame 
{
  private Button button;
   
    public MouseDemo()
	 {
	  button=new Button("Click Me");
	  
	  add(button,"South");
	  button.addMouseListener(new MouseAdapter()
	   {
	     public void mouseClicked(MouseEvent me)
		  {
		    int clicks=me.getClickCount();
			 if(clicks==2)
			   System.out.println("Double Clicked");
		  }
		  public void mouseEntered(MouseEvent me)
		   {
		    Cursor c=new Cursor(Cursor.HAND_CURSOR);
		    button.setCursor(c);
		    }
	   });		
	   addWindowListener(new WindowAdapter()
	   {
	     public void windowClosing(WindowEvent we)
		  {
		   System.exit(0);
		  }
	   });
	   setSize(300,300);
	   setVisible(true);
	  }
	  
	  public static void main(String args[])
	   {
		MouseDemo md=new MouseDemo();	     
	   }
	 }  
	   
	   
	  

