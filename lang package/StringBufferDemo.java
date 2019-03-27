import java.lang.*;

public class StringBufferDemo 
{
 public static void main(String[] args) 
 {
	 StringBuffer stb=new StringBuffer("welcome bdps software");
	 System.out.println("Original String is..."+stb);
	 System.out.println("capacity is..."+stb.capacity());
	 System.out.println("size...."+stb.length());
	 
	 System.out.println("Appended String is..."+stb.append(" BZA"));
	 System.out.println("capacity is..."+stb.capacity());
	 System.out.println("size...."+stb.length());
	 
	 System.out.println("inserted String is..."+stb.insert(21, " & Hardware"));
	 System.out.println("deleted String is..."+stb.delete(0, 8));
	 System.out.println("Replaced String is..."+stb.replace(25, 28, "vijayawada"));
	 System.out.println("string reverse is..."+stb.reverse());
	 
	 System.out.println("capacity is..."+stb.capacity());
	 System.out.println("size...."+stb.length());
	 			stb.trimToSize();
	System.out.println("capacity is..."+stb.capacity());
	 System.out.println("size...."+stb.length());
	 
	} 
}
