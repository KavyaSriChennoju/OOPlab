import java.io.*;
import java.lang.*;

class Resource
 {
   String address,name;

   void accept()
   {
         Console c=System.console();
         System.out.print("\tName...");
         name=c.readLine();
         System.out.print("\tAddress...");
          address=c.readLine();
  }
  void print()
   {
     System.out.println("Name is..>"+name);
    System.out.println("Address..."+address);
   }
}
class Student extends Resource
 {
   int sfee;
    void saccept()
    {
 System.out.println("Please Enter Student Details");
	       accept();
         Console c=System.console();
         System.out.print("\tStudent Fee..");
         sfee=Integer.parseInt(c.readLine());
   }

	void sprint()
	 {
	   print();
	   System.out.println("Fee is..."+sfee);
	System.out.println();
	  }
}
class Emp extends Resource
{
  int sal;
   void eaccept()
    {
      System.out.println("Please Enter Employee Details");
	       accept();
         Console c=System.console();
         System.out.print("\tEmployee Salary..");
         sal=Integer.parseInt(c.readLine());
	}
   void eprint()
   {
    print();
 System.out.println("Employee salary.."+sal);
	System.out.println();
   }
}

public class InheritanceDemo2
{
 public static void main(String args[])
  {
  	Student st=new Student();
	st.saccept();
    	 st.sprint();

	 Emp e=new Emp();
	  e.eaccept();
	  e.eprint();
  }
}
