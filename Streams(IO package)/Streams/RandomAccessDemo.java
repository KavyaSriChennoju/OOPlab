import java.io.*;

public class RandomAccessDemo 
{
  public static void main(String[] args) 
  {
	 try
	 {
RandomAccessFile rand=new RandomAccessFile("f:\\demo3.txt", "rw");
	   rand.writeInt(34300);
	   rand.writeFloat(3900.99f);
	   rand.writeUTF("bdps computers");
	   rand.writeBoolean(true);
	   System.out.println("file pointer..."+rand.getFilePointer());
	   rand.seek(0);
	   System.out.println("file pointer..."+rand.getFilePointer());
  System.out.println(rand.readInt());
	   System.out.println(rand.readFloat());
	   System.out.println(rand.readUTF());
	   System.out.println(rand.readBoolean());	   
	} catch (Exception e) 
	{
	  System.out.println(e);
	}
  }
}
