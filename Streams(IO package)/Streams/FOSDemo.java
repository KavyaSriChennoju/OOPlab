import java.io.*;
import java.lang.*;

public class FOSDemo 
{
  public static void main(String[] args) 
  {
	 try
	 {
		 File fname=new File("f:\\tdemo1.txt");
//		 FileOutputStream fos=new FileOutputStream(fname);
		 FileOutputStream fos=new FileOutputStream(fname,true);
		 byte data[]={'a','b','c','d','e','f','g','h'};
		 fos.write(data);
		 System.out.println("File is created");
	 }catch(IOException ie)
	 {
		 System.out.println(ie);
	 }
   }
}
