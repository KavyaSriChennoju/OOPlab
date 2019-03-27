public class ExpDemo2 
{
  public static void main(String[] args) 
  {
	  try {
		  int number=5090;
			 int res=number/0;
			 System.out.println("Result is..."+res);
			 number=number+10;		 
	} catch (ArithmeticException e) 
	{
	   System.out.println(e);
	}
	System.out.println("statement after try-catch");
   }
}

/*java.lang.ArithmeticException: / by zero
statement after try-catch*/