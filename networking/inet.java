import java.io.*;
import java.net.*;

public class inet
{
 public static void main(String args[])throws Exception
  {
	InetAddress inet=InetAddress.getLocalHost();
	System.out.println("Inet Address(both name/ip address..."+inet);
	System.out.println("Host name is.."+inet.getHostName());
	System.out.println("Host Address.."+inet.getHostAddress());

	InetAddress inet1=InetAddress.getByName("server");
	System.out.println("my Ip..  "+inet1);
	System.out.println("Host name is.."+inet1.getHostName());
	System.out.println("Host Address.."+inet1.getHostAddress());

	InetAddress ineta[]=InetAddress.getAllByName("server");
	 for(int i=0;i<ineta.length;i++)
	  System.out.println(ineta[i]);
  }
}


