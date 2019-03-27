import java.io.*;
import java.text.*;
import java.util.*;

public class MessageFormatDemo1
 {
  public static void main(String args[])
   {
String pattern="This is Certificate to he/she {0}, son/Daughter of {1} ,He/she is Completed is Course in {2},  Roll Number is..{5} Got the Rank is {3}, \n By the \n principle {4} Date is..{6} at time {7}";
         Object  values[]={
		    "Raju",
		    "Subba Rao",
		    "java Programming",
		    new Integer(500),
		    "Alok Nath",
		     new Integer(7291),
		     new Date(),
		     new Date()
		 };
        MessageFormat msg=new MessageFormat(pattern);

 msg.setFormat(4,NumberFormat.getCurrencyInstance());	
            msg.setFormat(6,DateFormat.getDateInstance(DateFormat.MEDIUM));
            msg.setFormat(7,DateFormat.getTimeInstance(DateFormat.SHORT));

     System.out.println(msg.format(values));
  }
}
