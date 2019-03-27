public class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int values[]={390,90,33,57,45,783,7340};
		
		System.out.println(values[0]);
		int size=values.length;
		System.out.println("array size is.."+size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println((i+1)+"...."+values[i]);
		}

	}

}
