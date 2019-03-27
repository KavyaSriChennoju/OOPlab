import java.io.*;
import java.lang.*;
import java.util.*;

public class SequenceTest3
{
  public static void main(String args[])
   {
     try
      {
       FileInputStream fis1=new FileInputStream("WriteFile.java");
      FileInputStream fis2=new FileInputStream("SequenceTest2.java");
		
	    Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(fis1);
		v.add(fis2);
		v.add(new FileInputStream("SequenceTest3.java"));

	Enumeration enu=v.elements();
       SequenceInputStream sis=new SequenceInputStream(enu);
//       SequenceInputStream sis=new SequenceInputStream(v.elements());

       FileOutputStream fos=new FileOutputStream("Mainfile.txt");
       int ch;
       while( (ch=sis.read()) !=-1)
        {
         System.out.print((char)ch);
         fos.write(ch);
         Thread.sleep(40);
        }
      }
      catch(Exception ie)
      {
       System.out.println(ie.getMessage());
      }
    }
 }