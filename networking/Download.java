import java.io.*;
import java.net.*;

public class Download
{
  public static void main(String args[])
   {
      try
	   {
 URL url=new URL("http://localhost:8085");
BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
		String str;
		while( (str=br.readLine())!=null)
		 {
		  System.out.println(str);
		  Thread.sleep(50);
		 }
	System.out.println("File is downloaded");
	   }catch(Exception ie)
	    {
		 System.out.println(ie);
		}
   }
 }

