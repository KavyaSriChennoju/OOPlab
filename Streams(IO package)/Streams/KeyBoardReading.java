import java.io.*;
import java.lang.*;
public class KeyBoardReading 
{
   public static void main(String[] args) 
   {
	 try
	 {
		/* InputStream is=System.in;
		 InputStreamReader isr=new InputStreamReader(is);
		 BufferedReader br=new BufferedReader(isr);*/
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("Please enter Student Name...");
		 String name=br.readLine();
		 
		 System.out.print("Please enter Student Number...");
		 int number=Integer.parseInt(br.readLine());
		 
		 System.out.println("Student Number..."+number);
		 System.out.println("Student Name..."+name);
		 
	 }catch(Exception ex)
	 {
		 System.out.println(ex);
	 }
   }
}
