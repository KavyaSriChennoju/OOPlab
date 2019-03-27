class TestMethods
{
	//instance methods
	public void print()
	{
		System.out.println("Welcome to Java");
	}
	public int square(int x)
	{
		int res=x*x;
		return res;
	}
}
public class MethodDemo2 
{
 public static void main(String[] args) 
 {
	 TestMethods tm=new TestMethods();
	 tm.print();
	 
	 System.out.println("Square of 5 is..."+tm.square(5));
}
}
