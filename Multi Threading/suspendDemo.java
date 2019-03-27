import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class suspendDemo extends Frame implements Runnable,ActionListener
 {
   private TextField tf;
   private Button sus,res;
   private Thread th;

private String str[]={"|","/","-","\\" ,"|","/","-","\\","|","/","-","\\"};

           public suspendDemo()
            {
	tf=new TextField();
	sus=new Button("Suspend");
	res=new Button("Resume");

	sus.addActionListener(this);
	res.addActionListener(this);

    Panel p=new Panel(new GridLayout(2,2));
	 p.add(new Label("Thread"));p.add(tf);
	p.add(sus);p.add(res);

	add(p,BorderLayout.NORTH);
	setSize(300,300);
	show();
          }

	public void run()
     {
	   int i=0;
	 th=Thread.currentThread();
	    while(true)
 	      {
	            try
	            {
		  tf.setText(str[i]);
		  Thread.sleep(500);
		  i++;
		   if( i >str.length-1)
		         i=0;
	          }catch(Exception ie)
	             {
System.out.println(ie.getMessage());
	            }
	      }
	}

public void actionPerformed(ActionEvent ae)
 	{
	    Button b=(Button)ae.getSource();
	     if(b==sus)
		th.suspend();
	      else
		th.resume();
     }
	public static void main(String args[])
	{
	   suspendDemo sdp=new suspendDemo();
	   Thread th=new Thread(sdp);
	 	th.start();
	}
}