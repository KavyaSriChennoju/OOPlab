import java.util.*;

public class StringTokenizerDemo2 
{
 public static void main(String[] args) 
 {
          String emails="info@bdps.in;mehaboob63@gmail.com;info@vijayawadaclassifieds.com";
	 StringTokenizer stk=new StringTokenizer(emails,";");
		int count=stk.countTokens();		
		System.out.println("no of tokens..."+count);		
		while(stk.hasMoreTokens())
		{
			String to=stk.nextToken();
			System.out.println(to);
			//smtp.send(to,"messsage");
		}
	 
 }
}
