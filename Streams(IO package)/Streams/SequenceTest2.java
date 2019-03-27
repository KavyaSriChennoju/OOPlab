 /*
class SequenceInputStream
	A SequenceInputStream represents the logical concatenation of other input streams. It starts out with an ordered collection of input streams and reads from the first one until end of file is reached, whereupon it reads from the second one, and so on, until end of file is reached on the last of the contained input streams. 

SequenceInputStream(Enumeration e) 
SequenceInputStream(InputStream s1, InputStream s2) 
*/
import java.io.*;
import java.lang.*;
public class SequenceTest2
{
  public static void main(String args[])
   {
     try
      {
       FileInputStream fis1=new FileInputStream("FISDemo.java");  
        FileInputStream fis2=new FileInputStream("FOSDemo.java");	   
       FileInputStream fis3=new FileInputStream("DISDemo.java");

SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
SequenceInputStream sis1=new SequenceInputStream(sis,fis3);

FileOutputStream fos=new FileOutputStream("Mainfile.txt");

       int ch;
       while( (ch=sis1.read()) !=-1)
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