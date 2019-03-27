
import java.awt.*;

public class FrameDemo1 extends Frame
{
  private Button b;
   public FrameDemo1()
   {
     super("Frame Demo");
     b=new Button("Click me");
     add(b);
     setSize(300,300);
     setVisible(true);
  }


  public static void main(String args[])

           {
     FrameDemo1 fd=new FrameDemo1();

   }

}
