abstract class MyAbs
{
	//abstract method
	public abstract void print();
	
	//non abstract method
	public void show()
	{
		System.out.println("statement in show of Myabs");
	}	
	
	//static method
	public static void printMsg(String str)
	{
		System.out.println("Message is..."+str);
	}
}
class MyAbsImp extends MyAbs
{
	public void display()
	{
		System.out.println("statement in display of MyAbsImp");
	}
	
	public void print()
	{
		System.out.println("statement in print MyAbs");
	}
}
public class AbstractDemo 
{
 public static void main(String[] args) 
 {
/*	 MyAbsImp mb=new MyAbsImp();
	 mb.print();
	 mb.display();
	 mb.show();*/
	 
	 MyAbs mb=new MyAbsImp();
	 mb.print();
	 //mb.display(); //the method display() is undefined for the type MyAbs
	 mb.show();
	 
	 //calling static method from MyAbs
	 MyAbs.printMsg("Hello Java");
}
}
