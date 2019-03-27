public class StaticDemo1 
{
	//instane variable
	int number=5000;
	
	//instance method 
	public void print()
	{
		System.out.println("Statement in Print Method");
	}
	
//class (static) fields
	static int tnumber=4999;
//static (class) method
	public static void display()
	{
		System.out.println("Statement in Display");
	}
	public static void main(String[] args) 
	{
		//accessing instance method
		StaticDemo1 st=new StaticDemo1();
		st.print();
		System.out.println("number is..."+st.number);
		
		//accessing static members
		display();
		System.out.println("Number is..."+tnumber);
	}
}
