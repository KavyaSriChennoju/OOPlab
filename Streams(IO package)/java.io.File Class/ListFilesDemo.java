import java.io.*;
import java.util.*;

public class ListFilesDemo 
{
	public static void main(String[] args) 
	{
		File fpath=new File("f:\\aspnet");		
		File files[]=fpath.listFiles();
		
		int dcount=0,fcount=0;
		for(File fname:files)
		{
			Date fdate=new Date(fname.lastModified());
			if(fname.isDirectory())
			{
				System.out.println(fdate+"\t<DIR>\t\t\t"+fname.getName());
				dcount++;
			}	
			else
			{
				System.out.println(fdate+"\t\t"+fname.length()+"\t\t"+fname.getName());
				fcount++;
			}
		}
System.out.println("\t\t Dir(s)  "+dcount);		
System.out.println("\t\t File(s)  "+fcount);
	}
}
