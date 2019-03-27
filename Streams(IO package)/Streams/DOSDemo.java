import java.io.*;
import java.lang.*;

public class DOSDemo 
{
 public static void main(String[] args) 
 {
	try 
	{
	    FileOutputStream fos=new FileOutputStream("f:\\tdemo2.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBoolean(true);
		dos.writeInt(454);
		dos.writeFloat(34.43f);
		dos.writeUTF("bdps Computers");
		dos.close();
		System.out.println("File is created");
	} catch (IOException e) 
	{
		e.printStackTrace();
		//System.out.println(e.getMessage());
		//System.out.println(e);
	}
}
}
