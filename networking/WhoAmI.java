import java.io.*;
import java.net.*;

public class WhoAmI 
{
 public static void main(String args[])
  {
     try
	  {
	   if(args.length!=1)
	     {
	   System.out.println("Usage :java WhoAmI hostName");
	   System.exit(0);
	  } 
	   String host=args[0];
	   InetAddress inet=InetAddress.getByName(host);
	   System.out.println("IP Address Of "+host+" is ."+inet);
	    }catch(UnknownHostException ae)
	   {
	    System.out.println(ae);
	    }	
    }
}  
 