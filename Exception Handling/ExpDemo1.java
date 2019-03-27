
public class ExpDemo1 
{
  public static void main(String[] args) 
  {
	 int number=5090;
	 int res=number/0;
	 System.out.println("Result is..."+res);
   }
}

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at ExpDemo1.main(ExpDemo1.java:7)
*/