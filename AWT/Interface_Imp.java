interface Simple
{
 public void show();
 }

class Interface_Imp implements Simple
  {
     private int i;

    public Interface_Imp()
	{
	 i=5656;
	}
	 public void show()
	 {
	 System.out.println("show in class Imple");
	 }
	  public void print()
	  {
     System.out.println("local mehtod print..");
	  }

	  public static void main(String args[])
	   {
		   /*
	   Interface_Imp iimp=new Interface_Imp();
		 iimp.show(); //calling from interface
		iimp.print(); //calling from the class
		*/


    Simple sp=new Interface_Imp();
        sp.show();
	    sp.print();


	  }
}
