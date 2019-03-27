import java.io.*;
import java.lang.*;

class ThreadA extends Thread
 {
   public void run()
    {
	  for(int i=0;i<5;i++)
	   {
	    System.out.println("Thread A is.."+i);
	   }
	}
}

class ThreadB extends Thread
 {
   public void run()
    {
	  for(int i=0;i<5;i++)
	   {
	    System.out.println("Thread B is.."+i);
	   }
	}
}

 public class ThreadName
  {
    public static void main(String args[])
	 {
		 ThreadA ta=new ThreadA();
		 ThreadB tb=new ThreadB();

System.out.println("Thread A..."+ta.getName());
	System.out.println("Thread B..."+tb.getName());

		 ta.start();
		 tb.start();

		 ta.setName("vijayawada...");
		 tb.setName("hyderabad.");

System.out.println("Thread A."+ta.getName());
System.out.println("Thread B.."+tb.getName());

Thread tm=Thread.currentThread();
System.out.println("main.Name."+tm.getName());

	   for(int i=0;i<5;i++)
	     System.out.println("main..."+i);
		}
 }
