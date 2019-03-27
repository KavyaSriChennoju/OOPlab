import java.util.*;

public class ArraysClassDemo 
{
   public static void main(String[] args) 
   {
	  int values[]={45,56,6,7,34,62,774,54,90};
//	  Printing Index
	  System.out.println("");
	  
	  for(int i=0;i<values.length;i++)
	  {
		  System.out.print(i+"\t");
	  }
	  //Printing Array elements
	 System.out.println("\n");
	   for(int i:values)
	  {
		  System.out.print(i+"\t");
	  }
    
	  //copying an array
	  	  int copy_values[]=Arrays.copyOf(values, 5);
	  System.out.println("\nPrinting copied array values");
	  for(int i:copy_values)
	  {
		  System.out.print(i+"\t");
	  }
    
	  //copyofRange
	  int copyRange[]=Arrays.copyOfRange(values, 4, 7);
	  System.out.println("\nPrinting copied Range array values");
	  for(int i:copyRange)
	  {
		  System.out.print(i+"\t");
	  }
	  
	  System.out.println("\nPrinting Sorted Array elements");
	  
	  Arrays.sort(values);
	  for(int i:values)
	  {
		  System.out.print(i+"\t");
	  }
	  
	  int narray[]=new int[5];
	  Arrays.fill(narray, 55);
	  System.out.println("\n printing Filled Array Elements");
	  for(int i:narray)
	  {
		  System.out.print(i+"\t");
	  }
	  
	  int index=Arrays.binarySearch(values, 55);
	  System.out.println("\nindex of 54 is..."+index);
	  
	  String str=Arrays.toString(values);
	  System.out.println("String is..."+str);
   }
}
