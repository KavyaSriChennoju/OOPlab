class Student
{
	//instance variable
	int number=3500;
	
	//instance method
	public void print()
	{
		System.out.println("statement in ptrint");
	}
	
	//static field
	static int nosem=8;
	//static method
	public static void display()
	{
		System.out.println("statement in dispaly");
	}
}
public class StaticDemo2 
{
 public static void main(String[] args) 
 {
	//accessing instance method
			Student st=new Student();
			st.print();
		System.out.println("number is..."+st.number);
			
			//accessing static members
			Student.display();
		System.out.println("Number is..."+Student.nosem);
} 
 
}
