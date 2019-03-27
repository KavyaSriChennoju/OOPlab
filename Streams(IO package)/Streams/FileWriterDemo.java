import java.io.*;
import java.lang.*;

public class FileWriterDemo 
{
  public static void main(String[] args) 
  {
	 try {
		 String fname="f:\\temp2.txt";
		 
		FileWriter fw=new FileWriter(fname,true);
		fw.write("welcome to javaStreams\n");
		fw.write("Good Bye to Java\n");
		fw.write("Sun Java programming\n");
		fw.close();
		
		FileReader fr=new FileReader(fname);
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	} catch (Exception e) 
	{
		System.out.println(e);
	}
  }
}
