public class FinallyDemo2
{
  public static void main(String[] args) 
  {
	 try
	 { 
		 int number=5090;
		 int res=number/5;
		 System.out.println("Result is..."+res);
	 }
	 catch (ArithmeticException e) 
	 {
      System.out.println("Catch.." +e);
	}
	 finally
	 {
		 System.out.println("statement in finally block");
	 }
	 System.out.println("statement after try-finally");
   }
}
/*
 //without catch block
statement in finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at FinallyDemo1.main(FinallyDemo1.java:9)*/

/*
 * with catch block
 * catch:java.lang.ArithmeticException: / by zero
statement in finally block
statement after try-finally*/
