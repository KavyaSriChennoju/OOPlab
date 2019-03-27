import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Frame_Image extends JFrame
 {
 private Image img;
   public Frame_Image()
    {
	 try
	 {
	   Toolkit tk=Toolkit.getDefaultToolkit();
	 img=tk.getImage("F:\\use.jpg");
	    }
	catch(Exception e)
	 {
	  System.out.println(e);
	 }
	 	setSize(800,600);
	 	show();
	}
	public void paint(Graphics g)
 	{
	   g.drawImage(img,100,100,this);
	 }

	public static void main(String args[])
	 {

	  Frame_Image fi=new Frame_Image();
	  }
 }