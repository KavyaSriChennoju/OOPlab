class ClassAB
{
	int number;
	String name;
	
	public void printInfo()
	{
		System.out.println("Number is..."+number);
		System.out.println("Name is...."+name);
	}
}
public class DefaultConsDemo 
{
  public static void main(String[] args) 
  {
	  //invoking default Constructor
/*	ClassAB ca;
	ca=new ClassAB();*/
	  
    ClassAB ca=new  ClassAB();
	ca.printInfo();
	
	ca.name="kiran";
	ca.number=50600;
	ca.printInfo();
	}
}
