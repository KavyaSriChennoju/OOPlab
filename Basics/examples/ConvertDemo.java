public class ConvertDemo 
{
 public static void main(String[] args) 
 {
	 short st=3434;
	 int number=st;
	 System.out.println("Number is..."+number);
	
	 float ft=455.54f;
	// int tno= ft; //Type mismatch: cannot convert from float to int
	 
	 //type casting
	int tno1= (int)ft;
	 System.out.println("value is..."+tno1);	 
	 
	 int ch=97;
	 System.out.println("char is..."+(char)ch);
  }
}
