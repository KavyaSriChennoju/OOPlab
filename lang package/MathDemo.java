/*
Math class
The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.
*/

public class MathDemo 
{
   public static void main(String[] args) 
   {
//	   double d=Math.PI;
//	   System.out.println("PI Value is..."+d);
	   
	 System.out.println("PI Values is..."+Math.PI);
	 System.out.println("absolute value is..."+Math.abs(-2949));
	 System.out.println("max of two number is..."+Math.max(49, 4959));
	 System.out.println("Min of two number is..."+Math.min(456, 565));
	 double rand=Math.random();
	 System.out.println("Random Number is..."+rand);
	 double mrand=rand*10;
	 System.out.println("Mulitiplied Random Number..."+mrand);
	 System.out.println("Rounded Random Number is..."+Math.round(mrand));
	 
	 System.out.println("Ceil Value is...."+Math.ceil(mrand));
	 System.out.println("Floor value is..."+Math.floor(mrand));
	 System.out.println("sqrt is..."+Math.sqrt(625));
   }
}
