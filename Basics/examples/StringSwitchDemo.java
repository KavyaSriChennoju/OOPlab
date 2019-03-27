public class StringSwitchDemo 
{
 public static void main(String[] args) 
 {
	 String dayOfWeek="Thursday";
	switch (dayOfWeek)
     {
         case "Monday":
           System.out.println("Start of work week");
                  break;
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
        	 System.out.println("Midweek");
             break;
         case "Friday":
        	 System.out.println("End of work week");
             break;
         case "Saturday":
         case "Sunday":
        	 System.out.println( "Weekend");
             break;
         default:
              	System.out.println( "Wrong Option");
     	}
 	}
}