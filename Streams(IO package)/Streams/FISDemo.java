import java.io.*;
import java.lang.*;

public class FISDemo 
{
 public static void main(String[] args)
 {
	try
	{
		File f=new File("f:\\tdemo1.txt");
		FileInputStream fis=new FileInputStream(f);
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
	} catch (IOException e) 
	{
		System.out.println(e);
	}
}
}
