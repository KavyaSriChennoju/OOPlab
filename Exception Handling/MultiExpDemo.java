public class MultiExpDemo 
{
	  public static void main(String[] args) 
	  {
		  try {
			  
	 	int no=Integer.parseInt("4ac");	
	
	 	int tnos[]=new int[5];
			 System.out.println(tnos[7]);				  				  
//			
/*			  int values[]=new int[-1];
			  System.out.println(values.length);*/
			  
				  int number=5090;
				 int res=number/0;
				 System.out.println("Result is..."+res);				 
		}
		 catch (ArithmeticException e) 
		{
		   System.out.println(e);
		}
		  catch(ArrayIndexOutOfBoundsException e) 
			 {
				System.out.println("Array Exp..."+e);
			}
	
		System.out.println("statement after try-catch");
	   }
	}
