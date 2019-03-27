class BTech
{
	private int sem=8;
	
	class CSE
	{
	  public void printCSE()
	  {
		  System.out.println("statement in CSE");
		  System.out.println("no of semisters in CSE..."+sem);
	  }
	}
	
	class EC
	{
		private int sno=6000;
		public void printEc()
		{
			System.out.println("Statement in EC");
			System.out.println("No of Semisters in EC.."+sem);
			System.out.println("Number is..."+sno);
		}
	}
	
}
public class NestedClassDemo1 
{
 public static void main(String[] args) 
 {
	 //creating object to the outer class
    BTech bt=new BTech();

    
    //creating object to the inner class
    BTech.CSE bc=bt.new CSE();
    bc.printCSE();
    
    BTech.EC ec=bt.new EC();
    ec.printEc();

}
}
