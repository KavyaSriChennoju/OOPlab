import java.awt.*;

public class FrameDemo extends Frame
{
   public FrameDemo()
   {
     super("Frame Demo");
	 setResizable(false);    
     setSize(300,300);
     setVisible(true);
  }
  public static void main(String args[])
   {
     FrameDemo fd=new FrameDemo();
   }

}
