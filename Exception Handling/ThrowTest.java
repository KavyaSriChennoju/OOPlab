import java.io.*;
import java.lang.*;

public class ThrowTest
{
   static void test(int no)throws Exception
    {
	  if(no >500)
	  throw new ArithmeticException("Value is Greater");
	   System.out.println("Value is.."+no);
	 }
 public static void main(String args[])
  {

    try
	 {
	  test(800);
	  }catch(ArithmeticException ae)
	   {
System.out.println("My error :"+ae);
	    }
   }
 }