import java.io.*;
import java.lang.*;

class MyNumberException extends Exception
 {
   int no;
     MyNumberException(int no)
	 {
	  this.no=no;
	  }
	  public String toString()
	  {
	   return "Error ..>"+no+"...Is Greater";
	  }
 }

public class UserDefinedException
{
   static void test(int no) throws MyNumberException   
       {
	  if(no >500)
	  throw new MyNumberException(no);
 System.out.println("Value is.."+no);
	 }

 public static void main(String args[])
  {
//test(300);
     try
	 {
           test(300);
	   }catch(MyNumberException ex)
	    {
		System.out.println(ex);
		}
   }
 }

