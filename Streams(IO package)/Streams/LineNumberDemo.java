import java.io.*;
import java.lang.*;

public class LineNumberDemo 
{
	public static void main(String[] args) 
	  {
		 try {
			 String fname="f:\\demo9.txt";
			LineNumberReader br=new LineNumberReader(
					new FileReader(fname));
			 String str;
br.setLineNumber(9);
			 while((str=br.readLine())!=null)
			 {
			 System.out.println(br.getLineNumber()+"  "+str);			
			 }
		} catch (Exception e) {
			System.out.println(e);
		}
}
}
