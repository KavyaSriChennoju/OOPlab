import java.util.*;

public class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		int day=d.getDay();
		
		System.out.println("Week day is..."+day);
		String weekday=null;
		
		switch(day)
		{
		case 0:
			weekday="Sunday";
			break;
	
		case 1:
				weekday="Monday";
				break;
		case 2:
			weekday="Tuesday";
			break;
		case 3:
			weekday="Wednesday";
			break;
		case 4:
			weekday="Thursday";
			break;
		case 5:
			weekday="Friday";
			break;
		case 6:
			weekday="Saturday";
			break;
		 default:
			  System.out.println("Wrong Day");
			}
		System.out.println("Week Day is..."+weekday);
	}
}
