
 enum Day 
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY 
}

public class EnumTest 
{
  public static void main(String[] args) 
{
	Day day;
	 switch (day)
	  {
	 case MONDAY: 
		 	System.out.println("Mondays are bad.");
		 	break;
	case FRIDAY: 
		System.out.println("Fridays are better.");
		break;
	case SATURDAY:
	case SUNDAY:
		System.out.println("Weekends are best.");	 
		 break;
						     
	default:
		System.out.println("Midweek days are so-so.");	
		break;
	}
}
}