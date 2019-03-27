public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		short sno=299;
		int number=5000;

		//float ft=566.65;
		//Type mismatch: cannot convert from double to float
		
		float ft=566.65F;
		double dval=7858.45;
		char ch='a';
		boolean isClosed=true;
		System.out.println("short value is..."+sno);
		System.out.println("int value is..."+number);
		System.out.println("float is..."+ft);
		System.out.println("double is..."+dval);
		
		System.out.println("char value is.."+ch);
		System.out.println("Boolean value is..."+isClosed);
		
		char ch2=97;
		System.out.println("char value is..."+ch2);
	}
}
