import java.io.*;
import java.net.*;

public class URLInfo
{
 public static void main(String args[])
  {
    try
	 {
 URL url1=new URL("http://www.yahoo.com/users/index.html");

	   URL url2=new URL("http://omnt.com:90/index.html#aboutus");

	   URL url3=new URL("http://www.microsoft.com/index.asp?soft=msdn&uid=bdps");

System.out.println("Url1:Protocal:"+url1.getProtocol());
System.out.println("url1:Default Port number is..."+url1.getDefaultPort() );
System.out.println("Url1: Port :"+url1.getPort());
System.out.println("Url1: File :"+url1.getFile());
System.out.println("Url1:Host :"+url1.getHost());

System.out.println("Url2:Port "+url2.getPort());
System.out.println("Url2: Reference..>"+url2.getRef());

System.out.println("Url3: Query String is:"+url3.getQuery());

      }catch(MalformedURLException uhe)
	   {
	     System.out.println(uhe);
		}
  }
}





