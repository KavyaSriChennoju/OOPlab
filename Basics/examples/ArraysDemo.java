import java.util.*;

public class ArraysDemo 
{
	public static void main(String[] args) 
	{
		int values[]={21,54,45,56,66,453,663,4,678,90,299};
		//printing array index
		
		for(int i=0;i<values.length;i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		//printing array elements
		for(int i:values)
		{
			System.out.print(i+"\t");
		}
		
		int nvalues[]=Arrays.copyOf(values, 5);
		System.out.println();
		//printing array elements
		for(int i:nvalues)
		{
			System.out.print(i+"\t");
		}
		
		int rvalues[]=Arrays.copyOfRange(values, 5, 8);
		System.out.println();
		//printing array elements
		for(int i:rvalues)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		Arrays.sort(values);
		for(int i:values)
		{
			System.out.print(i+"\t");
		}
		
		int loc=Arrays.binarySearch(values, 66);
		System.out.println("\nlocation of 66 is..."+loc);
		String nstr=Arrays.toString(values);
		System.out.println("\nString is..."+nstr);
	}
}
