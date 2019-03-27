import java.io.*;
import java.text.*;
import java.util.*;

public class MessageFormatDemo
 {
  public static void main(String args[])
   {
String pattern="This is Certificate to he/she {0}, son/Daughter of {1} ,He/she is Completed is Course in {2},  Roll Number is..{5} Got the Rank is {3}, \n By the \n principle {4} Date is..{6}";
         
		 Object  values[]={
		    "Raju",
		    "Subba Rao",
		    "java Programming",
		    new Integer(5),
		    "Alok Nath",
		     new Integer(7291),
		     new Date()
		 };
      String result=MessageFormat.format(pattern,values);
     System.out.println(result);	 			
   }
}
