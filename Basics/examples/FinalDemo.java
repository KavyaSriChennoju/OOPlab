final class classA
{
final void show()
   {
    System.out.println("show in classA...");
  }
}

class classB extends classA
{
//error
 void show()
  {
  System.out.println("show in classB..");
  }
}

public class FinalDemo
{
public static void main(String args[])
 {
  final int a=9000;
System.out.println("Value is..."+a);
a=8000; //error
   classB cb=new classB();
    cb.show();
 }
}
