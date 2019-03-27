class Engineering
{
	public void printMessage()
	{
		System.out.println("welcome to 2012-2015 batch");
	}
	//static nested class
	static class CSE
	{
		static int number=5000;
		public static void print()
		{
			System.out.println("Number is..."+number);
			/*Engineering en=new Engineering();
			en.printMessage();*/
		}
	}
	
	//inner classes
	class Civil
	{
		int code=2949;
		public void printCode()
		{
			System.out.println("Code is..."+code);
					}
	} 		
}
public class StaticNestedDemo 
{	
	public static void main(String[] args) 
	{
		//creating object for OuterClass
		Engineering eng=new Engineering(); 
		eng.printMessage(); //calling outerclass's method
		
		//calling static nested class's method
		Engineering.CSE.print(); 
		Engineering.CSE.number=67000;
		
	System.out.println("New Number is..."+Engineering.CSE.number);
		
		//creating an object to the inner-class
		Engineering.Civil cv=eng.new Civil();    
		cv.printCode();
		cv.code=500;
		System.out.println("new Code is..."+cv.code);
	}
}
