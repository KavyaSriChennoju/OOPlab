import java.io.*;
import java.util.*;

class ThreadA  extends Object implements Runnable
{
  public void run()
   {
    for(int i=1;i<5;i++)
	 {
	  System.out.println("ThreadA..."+i);
	   	}
     }
 }
   public class RunnableDemo
    {
	  public static void main(String artgs[])
	   {
			ThreadA ta=new ThreadA();
	Thread th=new Thread(ta);
			th.start();

			for(int i=0;i<5;i++)
			{
			 System.out.println("Main...."+i);
			}
	     	}
 }



























































