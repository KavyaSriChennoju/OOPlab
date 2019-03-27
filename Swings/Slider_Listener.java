import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Slider_Listener extends JFrame implements ChangeListener
{
 private JSlider color;
 private JLabel jl;
 
 public Slider_Listener()
 {
   color=new JSlider(0,255,0);
   jl=new JLabel("Bdps Sofware Ltd",SwingConstants.CENTER);
   jl.setFont(new Font("Arial Black",Font.BOLD,36));
   getContentPane().add(jl);
   getContentPane().add(color,"North");
   
   color.addChangeListener(this);
   setBounds(200,200,300,300);
   show();
  }
  public void stateChanged(ChangeEvent ce)
   {
      int c=color.getValue();
      Color cl=new Color(c,120,50);
	  jl.setForeground(cl);
     }
   public static void main(String args[])
    {
	 Slider_Listener sl=new Slider_Listener();
	 }
}	 