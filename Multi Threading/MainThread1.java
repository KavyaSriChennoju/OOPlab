import java.io.*;
import java.lang.*;

class MyThread extends Object implements Runnable
{
  public void run()
   {
    for(int i=0;i<5;i++)
	 {
	  System.out.println("Value is.."+i);
	 }
   }
}
public class MainThread1
{
 public static void main(String args[])
  {
    MyThread ra=new MyThread();
	
	Thread ta=new Thread(ra);
	ta.start();
	 
	  for(int i=0;i<5;i++)
	   System.out.println("main .."+i);
  }
 }  
  
  
