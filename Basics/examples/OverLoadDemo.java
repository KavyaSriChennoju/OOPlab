class Student
{
	public void printStudent()
	{
		System.out.println("Number is...1001");
		System.out.println("Name is...Baig");
	}
	
	public void printStudent(int number)
	{
		System.out.println("Number is..."+number);
		System.out.println("Name is...baig");
	}
	
	public void printStudent(int number,String name)
	{
		System.out.println("Number is.."+number);
		System.out.println("Name is..."+name);
	}
}
public class OverLoadDemo 
{
 public static void main(String[] args) 
 {
	 Student st=new Student();
	 st.printStudent();
	 st.printStudent(3001);
	 st.printStudent(3200, "siva");
  }
}
