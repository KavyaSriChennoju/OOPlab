import java.io.*;
import java.awt.*;

public class Check_Radio extends Frame
{
 private Checkbox ch1,ch2,ch3;

 private Checkbox radio1,radio2;

 private CheckboxGroup cbg;

  public Check_Radio()
   {
    ch1=new Checkbox("Graduate");
	ch2=new Checkbox("Post Graduate");
	ch3=new Checkbox("Mca");

Panel jp=new Panel(new GridLayout(3,1));
jp.setBackground(Color.pink);
jp.add(ch1);jp.add(ch2);jp.add(ch3);

	cbg=new CheckboxGroup();
radio1=new Checkbox("Male",cbg,true);
radio2=new Checkbox("Female",cbg,false);

 	GridLayout gl=new GridLayout(1,2);
	Panel p2=new Panel(gl);
	p2.setBackground(Color.red);
p2.add(radio1);p2.add(radio2);

	add(jp,BorderLayout.NORTH);
	add(p2,BorderLayout.SOUTH);

	setSize(300,300);
	setVisible(true);
}
 public static void main(String args[])
  {
   Check_Radio chr=new Check_Radio();
  }
}

