import java.io.*;
import java.net.*;

public class TestAuthen
{
  public static void main(String args[])
   {
      try
	   {
	      String furl=args[0];
		 String username=args[1];
		 String password=args[2];
		 
	    URL url=new URL(furl);
		Authenticator.setDefault
		(new MyAuthenticator(username,password));
		BufferedReader br=new BufferedReader
		(new InputStreamReader(url.openStream()));
		String str;
		while( (str=br.readLine())!=null)
		 {
		  System.out.println(str);
		  Thread.sleep(50);
		 } 
		System.out.println("File is downloaded");  
	   
	   }catch(Exception ie) 
	    {
	 System.out.println("Error in user Name & password"+ie.getMessage());
		}
   }
 }  
   
 class MyAuthenticator extends Authenticator  
 {
    String uname,pwd;
	  public MyAuthenticator(String uname,String pwd)
	   {
	     this.uname=uname;
	    this.pwd=pwd;
	    }
		 
	  protected PasswordAuthentication getPasswordAuthentication()
	   {
	    return  new PasswordAuthentication(uname,pwd.toCharArray());
	   }	 
 }	  