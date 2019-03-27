import java.io.*;
import java.text.*;
import java.util.*;

public class DateFormatDemo 
 {
   public static void main(String args[])
    {
       Date d=new Date();	
       DateFormat df=DateFormat.getDateInstance();
       System.out.println("Date is.."+df.format(d));	

       DateFormat dfs=DateFormat.getDateInstance(DateFormat.FULL);
       System.out.println("Date is.. FULL..."+dfs.format(d));	

       DateFormat dfl=DateFormat.getDateInstance(DateFormat.LONG,Locale.FRANCE);
       System.out.println("Date is..long & france..."+dfl.format(d));	

       DateFormat dtf=DateFormat.getDateTimeInstance();
       System.out.println("Date is.."+dtf.format(d));	

       DateFormat dtfs=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT);
       System.out.println("Date is.."+dtfs.format(d));	

          System.out.println("Time Zone is.."+df.getTimeZone());
          
   }
}