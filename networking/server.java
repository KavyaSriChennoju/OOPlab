import java.io.*;
import java.net.*;

public class server 
{
  private BufferedReader br;
  private DataInputStream dis;
  private DataOutputStream dos;
  private String send,received;
  private Socket scl;
  private ServerSocket ss;
   
   public server()
   {
     try
	 {
      ss=new ServerSocket(5657);
	  scl=ss.accept();
      br=new BufferedReader(new InputStreamReader(System.in));
	  dis=new DataInputStream(scl.getInputStream());
dos=new DataOutputStream(scl.getOutputStream());
	  }
	  catch(Exception e)
	   {
	    System.out.println(e.getMessage());
		}
	}

	public void chat()
	{
	  System.out.println("I am server");
	do
	{
	 try
	 {
	  System.out.print("Select your Option (s/r/q):");
	  String ch=br.readLine();
	      
	  switch(ch.charAt(0))
	  {
	    case 's':
		System.out.print("Enter your Data:");
		send=br.readLine();					dos.writeUTF(send);
		break;
	     case 'r':
	System.out.print("You Have Received Message.:");
	received=dis.readUTF();
	System.out.println(received);
	break;
          case 'q':	
			System.exit(0);
			break;
default:	
	  System.out.println("Your choice is wrong");
					
    }					
 }
 catch(Exception e)
 {
  System.out.println(e.getMessage());
  }
 } while(true);
 }
	
 public static void main(String arg[]) 
{
  server c=new server();
  c.chat();
 }
} 