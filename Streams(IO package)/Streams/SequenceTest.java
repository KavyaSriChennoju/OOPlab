import java.io.*;
import java.lang.*;

public class SequenceTest
{
  public static void main(String args[])
   {
     try
      {
       FileInputStream fis1=new FileInputStream("Write_Read.java");
       FileInputStream fis2=new FileInputStream("DataRead.java");
       SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
       int ch;
       while( (ch=sis.read()) !=-1)
        {
         System.out.print((char)ch);
        Thread.sleep(100);
        }
      }
      catch(Exception ie)
      {
       System.out.println(ie.getMessage());
      }
    }
 }


