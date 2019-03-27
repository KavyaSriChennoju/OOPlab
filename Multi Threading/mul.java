import java.io.*;
import java.util.*;
class mult implements Runnable
{
 Thread t;
 String name;
 mult(String threadname)
 {
   name=threadname; 
     t= new Thread(this,name);
	 t.start();
}
  public void run()
   {
    for(int i=5;i>0;i--)
	 { 
	 try
	 {
	  System.out.println(name+":"+i);
	   Thread.sleep(1000);
	 }
	 catch(InterruptedException e)
	   {
	     System.out.println(name +"interrupted");
		 }
	System.out.println(name+"exiting");
	}
	}
 }
   public class mul 
    { 
	  public static void main(String artgs[])
	   {
	     mult ob1= new mult("one");
		 mult ob2= new mult("two");
		 mult ob3= new mult("three");
		  System.out.println("status of one thread "+ob1.t.isAlive());
            System.out.println("status of two thread "+ob2.t.isAlive());
			  System.out.println("status of three thread "+ob3.t.isAlive());
			  try
	            {
				  ob1.t.join();
				  ob2.t.join();
				  ob3.t.join();
				 }
				  catch(InterruptedException e)
				  {
				    System.out.println("main thread interrupted");
					}
				System.out.println("status of one thread "+ob1.t.isAlive());
            System.out.println("status of two thread "+ob2.t.isAlive());
			  System.out.println("status of three thread "+ob3.t.isAlive());
			System.out.println("mainthread finished");
			}
		}	  



























































