import java.io.*;
import java.util.Properties;

public class CreateDir
{
 public static void main(String args[])
  {	 
    File f=new File("e:\\hello1");
   File f1=new File("e:\\hai\\bye\\goodnight");
   
	 if(!f.exists())
	  {
	   f.mkdir();
	    System.out.println(f+"...Is Created");
	  }
	  else
	   System.out.println(f+"...Is Already Existed..");
           
	   f1.mkdirs();
    }
 }