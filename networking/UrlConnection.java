import java.io.*;
import java.net.*;

public class UrlConnection 
{
 public static void main(String args[])throws Exception 
  {
   URL url=new URL("http://omnt.com/index.html");
   URLConnection con=url.openConnection();
   System.out.println(" Content Type.. "+con.getContentType());
   System.out.println(" content Length is.."+con.getContentLength());   
   System.out.println(" Content encoding .."+con.getContentEncoding());
   }    
}
  
  