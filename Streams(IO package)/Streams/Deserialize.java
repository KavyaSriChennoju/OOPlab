import java.io.*;
import java.lang.*;
import java.util.*;

public class Deserialize 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fis=new FileInputStream("d:\\tmp");
			ObjectInputStream obs=new ObjectInputStream(fis);
			String data=(String)obs.readObject();
			Date d=(Date)obs.readObject();
			
			System.out.println(data);
			System.out.println(d);
		} catch (Exception e) {
System.out.println(e);
		}
	}
}
