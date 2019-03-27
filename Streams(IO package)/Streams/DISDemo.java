import java.io.*;
import java.lang.*;

public class DISDemo 
{
 public static void main(String[] args)
 {
	try {
		FileInputStream fis=new FileInputStream("f:\\tdemo2.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readUTF());
	} catch (Exception e)
	{
     e.printStackTrace();
	}
}
}
