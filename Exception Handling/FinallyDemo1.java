public class FinallyDemo1
{
  public static void main(String[] args) 
  {
	 try
	 { 
		 int number=5090;
		 //int res=number/1; //case :1
		 int res=number/0; //case :2
	 System.out.println("Result is..."+res);
	 }finally
	 {
		 System.out.println("statement in finally block");
	 }
	 System.out.println("statement after try-finally");
   }
}
/*
 * output Case 1:
 * Result is...5090
statement in finally block
statement after try-finally

Output Case 2:
statement in finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at FinallyDemo1.main(FinallyDemo1.java:9)*/

