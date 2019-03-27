class ClassA1
{
	int no=7000;
	public void print()
	{
		System.out.println("statement in print():ClassA1");
	}
}
class ClassB1 extends ClassA1
{
	int no=8000;
	public void show()
	{
		print();
		super.print();
		System.out.println("statement in show():ClassB1");
		System.out.println("Number is..."+no);
		System.out.println("Number is..."+super.no);
	}
	
	public void print()
	{
		System.out.println("statement in print():ClassB1");
	}
}
public class SuperDemo2 
{
	public static void main(String[] args) 
	{
		ClassB1 cb=new ClassB1();
		cb.show();
		//cb.print();
	}
}
