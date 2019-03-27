public class MethodDemo1 
{
	//instance methods (non-static)
  public void print()
  {
	  System.out.println("Welcome to BDPS");
  }
  public void print(String msg)
  {
	  System.out.println("Welcome to "+msg);
  }
  public int getNumber()
  {
	  int number=40003;
	  return number;
  }
  public int square(int x)
  {
	  int res=x*x;
	  return res;
  }
  
  //class  (static) methods
 public static void main(String[] args) 
 {
	 //creating an object
	MethodDemo1 md=new MethodDemo1();
	
	//calling instance methods
	md.print();
	md.print("NIIT");
	
	int tno=md.getNumber();
	System.out.println("number is..."+tno);
	
	System.out.println("Number is..."+md.getNumber());
	
	int res=md.square(5);
	System.out.println("Square of 5 is..."+res);
 }
}
