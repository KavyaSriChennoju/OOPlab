import java.util.*;

public class IfDemo 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		int hours=d.getHours();
		
		System.out.println("Hour is..."+hours);
		
		if(hours <12)
			System.out.println("Good Morning");
		else if(hours>=12 && hours <=17)
			System.out.println("Good After noon");
		else
			System.out.println("good Evening");
	}
}
