import java.lang.*;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String str=new String("welcome to evening event");
		
		char ch=str.charAt(0);
		System.out.println("char at 0 is..."+ch);
				String constr=str.concat("-VJA");
				System.out.println("concated string is..."+constr);
				
	System.out.println("index of 'e' is..."+str.indexOf('e'));
	System.out.println("Index of 'e' from 10 is..."+str.indexOf('e',10));
	
	System.out.println("length is..."+str.length());
	System.out.println("is empty ..."+str.isEmpty());
	System.out.println("last index of 'e' is..."+str.lastIndexOf('e'));
	System.out.println("replaced String is..."+str.replace('e', 'x'));
	
		System.out.println("Substring is..."+str.substring(11));
		System.out.println("substring is.."+str.substring(11,18));
		
		String ustr=str.toUpperCase();
		System.out.println("upper cased string is..."+ustr);
		System.out.println("lower cased string is..."+ustr.toLowerCase());
		
		String tstr=" vijayawada ";
		System.out.println("trimmed text is..."+tstr.trim()+"....");
	}
}
