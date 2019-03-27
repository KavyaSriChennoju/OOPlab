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
 public class MainThread
  {
    public static void main(String args[])
	 {
		 ThreadA ta=new ThreadA();
		 ThreadB tb=new ThreadB();

		 ta.start();
		 tb.start();

		  for(int i=0;i<5;i++)
	     System.out.println("main..."+i);

	}
 }

