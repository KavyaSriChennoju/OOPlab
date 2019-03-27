
public class PreExpDemo 
{
	public static void main(String[] args) 
	{
		int number=8900;
		//int res=number/5; //case ->1
		int res=number/0 ; //case ->2
		System.out.println("Result is..."+res);
	}
}

//Output case :1
//Result is...1780

//output case :2
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at PreExpDemo.main(PreExpDemo.java:8)

