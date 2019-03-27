import java.util.*;

public class StringTokenizerDemo1 
{
	public static void main(String[] args) 
	{
		String str="welcome to oracle java programing in BDPS";
		StringTokenizer stk=new StringTokenizer(str);
		int count=stk.countTokens();		
		System.out.println("no of tokens..."+count);		
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
	}
}
