import java.io.*;
import java.lang.*;

public class BufferReaderDemo
{
 public static void main(String args[])throws Exception
  {
   BufferedReader br=new BufferedReader(new FileReader("mainfile.txt"));
   String  str;
   while( (str=br.readLine()) !=null)
   {
    System.out.println(str);
     Thread.sleep(100);	
    }		
br.close();
System.out.println("File is Readed  ");
  }
}  
  
  