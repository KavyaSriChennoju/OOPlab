import java.io.*;
import java.lang.*;

public class WrapperTest
{
 public static void main(String args[])
  {
  //converting String into int.
    String sno="3434";
    Integer ivalue=new Integer(sno);
     int i=ivalue.intValue();
     System.out.println("Value in int is.."+(i+20));

  //converting Integer Object into String
     Integer ival=new Integer(6000);
     String str=ival.toString();
 System.out.println("int to String is..."+(str+10));

 
       int no=Integer.parseInt(sno);
       System.out.println("Vaue is.."+no);

   // converting integer to String (String Class)
	//step 1
	//String str=String.valueOf(no);

       //step 2  (Integer Class)
	String st=Integer.toString(no);

  int value=100;
  System.out.println("Binary String is.."+Integer.toBinaryString(value));
  System.out.println("Hex String is.."+Integer.toHexString(value));
  System.out.println("Octal String is.."+Integer.toOctalString(value));
  }
}
