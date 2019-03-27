import java.io.*;
import java.util.*;
import java.lang.*;
import java.applet.*;
import java.awt.*;

public class digitalClock extends Applet
{
    private Date d;
    private int hh,mm,ss;
	
    public void init()
         {
     d=new Date();       	 
	hh=d.getHours();
	mm=d.getMinutes();
	ss=d.getSeconds();
	
          }

	public void paint(Graphics g)
	{
	while(true)
	   {
	      g.clearRect(80,80,150,150);
	       try
	          {
		if(ss <=59)
		   ss=ss+1;
		 if( ss >59 && mm <=59)
		    {
		         mm=mm+1;
		           ss=0;
	         }
		  if( mm >59 && hh <=23)
	                {
		             hh=hh+1;
			mm=0;
                      }	
	                Thread.sleep(1000);
	            }catch(Exception ie)
	         {  }
		String sh=String.valueOf(hh);
		String sm=String.valueOf(mm);
		String s=String.valueOf(ss);
	    g.setColor(Color.red);
	    g.setFont(new Font("Arial",Font.BOLD,25));
	    g.drawString(sh+":"+sm+":"+s,100,100);
			    }
              }
}
	