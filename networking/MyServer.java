import java.io.*;
import java.net.*;

public class MyServer
{
 public static void main(String args[])
  {
     try
     {
       ServerSocket ss=new ServerSocket(9989);
       Socket client=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
PrintWriter pw=new PrintWriter(client.getOutputStream());

 pw.print("Please Enter Any Message...:");
         boolean end=false;
          while(!end)
           {
               String str=br.readLine();
   	if(str==null)
	   end=true;
	else
 	{

	   if(str.equals("exit"))
 	    end=true;
 	  pw.println(str);
                   }

             }
        }
           catch(Exception e)
           {
              System.out.println(e.getMessage());
            }
    }
}  
            	
