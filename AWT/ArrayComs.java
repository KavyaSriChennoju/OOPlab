import java.io.*;
import java.awt.*;

public class ArrayComs extends Frame
 {
  private Button but[];
  
  public ArrayComs()
   {
    but=new Button[5];
	
	 for(int i=0;i<5;i++)
	  but[i]=new Button("hello.."+i);
	  
	  Panel panel=new Panel();
	  
	   for(int i=0;i<5;i++)
	    panel.add(but[i]);
		
	  add(panel,BorderLayout.SOUTH);
	  setSize(300,200);
	  setVisible(true);
	 }
	 
	 public static void main(String args[])
	  {
	  ArrayComs ars=new ArrayComs();  
	  }
}	  
	  
	  
	  
	  
	  