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

 public class ThreadPriority
  {
    public static void main(String args[])
	 {
		 ThreadA ta=new ThreadA();
		 ThreadB tb=new ThreadB();

System.out.println("Thread A Priority..."+ta.getPriority());
System.out.println("Thread B Priority..."+tb.getPriority());

	ta.setPriority(3);
	tb.setPriority(Thread.MAX_PRIORITY);
		 ta.start();
		 tb.start();

   System.out.println("Thread A.Priority.."+ta.getPriority());
   	System.out.println("Thread B.Priority.."+tb.getPriority());

	 Thread tm=Thread.currentThread();
		tm.setPriority(1);
		for(int i=0;i<5;i++)
	     System.out.println("main..."+i);
	}
 }