
/*
JSlider:
	A component that lets the user graphically select a value by sliding a knob within a bounded interval. The slider can show both major tick marks and minor tick marks between them. The number of values between the tick marks is controlled with setMajorTickSpacing and setMinorTickSpacing.
*/
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class SliderDemo extends JFrame
{
  private JSlider hsl,vsl;

   public SliderDemo()
    {
      setTitle("JSlider Demo");
	  hsl=new JSlider();

 	hsl.setMinorTickSpacing(5);
	 hsl.setMajorTickSpacing(10);
  hsl.setPaintTicks(true);

	hsl.setPaintLabels(true);
  hsl.setSnapToTicks(true);
 hsl.setBackground(Color.pink);
 hsl.setForeground(Color.blue);

vsl=new JSlider(SwingConstants.VERTICAL,200,400,300);
	vsl.setPaintTrack(false);

	  getContentPane().add(hsl,"North");
	  getContentPane().add(vsl,"West");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(300,300);
	 setVisible(true);
	 }
	 public static void main(String args[])
	  {
	   SliderDemo sd=new SliderDemo();
	   }
}


