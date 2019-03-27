import java.io.*;
import java.lang.*;

public class ListDemo 
{
 public static void main(String[] args) 
 {
	 File fpath=new File("f:\\aspnet");
	 
	 String files[]=fpath.list();
	 
	 for(String fname:files)
	 {
		  //if(fname.startsWith("s"))
		// if(fname.endsWith("txt"))
		 if(fname.startsWith("a") && fname.endsWith("txt"))
		 System.out.println(fname);
	 }
 }
}
