interface Test
{
   void print();
} 
interface Simple   extends Test
{
  void show();
 }

class Interface_Imp2 implements Simple
  {
  private int i;
  public Interface_Imp2()
	{
	 i=5656;
	}
	 public void show()
	 {
	 System.out.println("show in class Imple");
	 }
	  public void print()
	  {
     	     System.out.println("this in class..");
	  }

	  public void display()
	  {
	  System.out.println("display in class...");
	  }
	  public static void main(String args[])
	   {
	/* Interface_Imp2 sp=new Interface_Imp2();
		   sp.show();
		    sp.print();
		    sp.display();*/

    Simple sp=new Interface_Imp2();
        sp.show();
	    sp.print();
	    //sp.display(); //generates an error
/*
 Test sp=new Interface_Imp2();
    sp.print();
  sp.show(); //error
    sp.display(); //error
*/
	  }
}
