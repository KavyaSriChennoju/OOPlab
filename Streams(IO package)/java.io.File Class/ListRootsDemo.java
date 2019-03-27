//printing list of drives
import java.io.*;

public class ListRootsDemo 
{
 public static void main(String[] args) 
 {
	 File drives[]=File.listRoots();
	 
	 for(File dname:drives)
	 {
		 System.out.println(dname);
	 }
}
}
