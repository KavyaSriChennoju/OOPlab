class ClassA
{
	public ClassA()
	{
		System.out.println("statement in ClassA non-param contructor");
	}
	public ClassA(int no)
	{
		System.out.println("Statemen in ClassA param Constructor..."+no);
	}
}
class ClassB extends ClassA
{
	public ClassB()
	{
		super(400);
		//new ClassA(400);
		System.out.println("statement in ClassB non-param contructor");
	}
}
public class SuperDemo1
{
 public static void main(String[] args) 
 	{
	 ClassB cb=new ClassB();
}
}
//Constructor call must be the first statement in a constructor
