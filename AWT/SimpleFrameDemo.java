import java.awt.*;

public class SimpleFrameDemo
{
  public static void main(String args[])
   {
   	 Frame f=new Frame();
	 //Frame f=new Frame("This is titile");
	 f.setLocation(100,100);
	 f.setResizable(false);
	 f.setSize(300,300);
	 f.setVisible(true);
   }
}