import java.util.*;

public class DateDemo 
{
 public static void main(String[] args) 
 {
	 Date d=new Date();
	 System.out.println("full date is..."+d);
	 System.out.println("Year..."+d.getYear());
	 System.out.println("Month is..."+d.getMonth());
	 System.out.println("Date is.."+d.getDate());
	 System.out.println("week day is..."+d.getDay());
	 System.out.println("Hours..."+d.getHours());
	 
	 System.out.println("to GMT string.."+d.toGMTString());
	 System.out.println("to Locale String is..."+d.toLocaleString());	 
 }
}
