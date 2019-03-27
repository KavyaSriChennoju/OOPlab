public class StaticInitializationDemo
{
  static
    {
     System.out.println("WELCOME TO JAVA BY Baig...");
    }

 public static void main(String args[])
  {
    System.out.println("statement in main...");
  }
  
   static
    {
     System.out.println("static block");
    }
}