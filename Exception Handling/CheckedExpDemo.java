
public class CheckedExpDemo 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
		 System.out.println(e);
		}
	}
}


//Unhandled exception type ClassNotFoundException