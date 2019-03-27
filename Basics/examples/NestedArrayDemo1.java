public class NestedArrayDemo1 
{
 public static void main(String[] args) 
 {
	  int values[][]; //declaration
	  values=new int[2][2]; //allocation
	  
	  values[0][0]=1001;
	  values[0][1]=1002;
	  
	  values[1][0]=2001;
	  values[1][1]=2002;
	  
	  System.out.println(values[0][0]+"\t"+values[0][1]);
	  System.out.println(values[1][0]+"\t"+values[1][1]);
 }
}
