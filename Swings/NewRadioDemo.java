/*
  USING JCheckBox, JRadioButton; ButtonGroup;
  using Borders;
  */


import java.awt.*;
import javax.swing.*;


public class NewRadioDemo extends JFrame
{
 //un-grouped check box, radio buttons
  private JCheckBox ch1,ch2,ch3;
  private JRadioButton rb1,rb2,rb3;

  //grouped check box, radio buttons
  private JCheckBox gch1,gch2,gch3;
  private JRadioButton grb1,grb2,grb3;

  //to group
    private ButtonGroup bgp;

 	public NewRadioDemo()
 	{
 	  setTitle("JRadioButton,JCheckBox Demo"); 
	ch1=new JCheckBox("MTECH");
 	  ch2=new JCheckBox("MCA");
 	  ch3=new JCheckBox("MBA");

		rb1=new JRadioButton("MTECH");
		rb2=new JRadioButton("MCA");
		rb3=new JRadioButton("MBA");

bgp=new ButtonGroup();

 	  gch1=new JCheckBox("MTECH");
 	  gch2=new JCheckBox("MCA");
 	  gch3=new JCheckBox("MBA");

//adding grouped checkboxes to the ButtonGroup
	bgp.add(gch1);
	bgp.add(gch2);
	bgp.add(gch3);

 	
 	  grb1=new JRadioButton("MTECH");
	  grb2=new JRadioButton("MCA");
	  grb3=new JRadioButton("MBA");

 ButtonGroup bg=new ButtonGroup();
//adding grouped radiobuttons to the ButtonGroup
	  bg.add(grb1);
	  bg.add(grb2);
	  bg.add(grb3);

	  JPanel jp1=new JPanel(new GridLayout(3,2));
	  jp1.add(ch1);jp1.add(rb1);
	  jp1.add(ch2);jp1.add(rb2);
	  jp1.add(ch3);jp1.add(rb3);

 //adding titledborder to the panel 1
	jp1.setBorder(BorderFactory.createTitledBorder("Qualification"));

	  JPanel jp2=new JPanel(new GridLayout(3,2));
	  	  jp2.add(gch1);jp2.add(grb1);
	  	  jp2.add(gch2);jp2.add(grb2);
	  	  jp2.add(gch3);jp2.add(grb3);

	//jp2.setBorder(BorderFactory.createLineBorder(Color.red));
jp2.setBorder(BorderFactory.createLineBorder(Color.green,4));

	  getContentPane().add(jp1,"North");
	  getContentPane().add(jp2,"South");
	setDefaultCloseOperation(3);
	setSize(300,300);
	setVisible(true);
 	}
 	public static void main(String args[])
 	{
 	  NewRadioDemo nrd=new NewRadioDemo();
 	}

}