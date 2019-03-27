import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioDemo extends JFrame implements ActionListener
{
  private JRadioButton rkb,rmb,rgb;
  private JLabel l1,l2;
  private JTextField jtf1,jtf2;

 private ButtonGroup bgp;
  private double value;
  private double result;

  public RadioDemo()
   {
	    bgp=new ButtonGroup();
        rkb=new JRadioButton("KB");
        rmb=new JRadioButton("MB");
        rgb=new JRadioButton("GB");

         l1=new JLabel("Enter Bytes");
         l2=new JLabel("Result");

         jtf1=new JTextField();
         jtf2=new JTextField();
         
//adding radio buttons to ButtonGroup Object
       bgp.add(rkb);bgp.add(rmb);bgp.add(rgb); 

          JPanel jp=new JPanel(new GridLayout(2,2));
          jp.add(l1);jp.add(jtf1);
          jp.add(l2);jp.add(jtf2);

          JPanel jp1=new JPanel();
       jp1.add(rkb);jp1.add(rmb);jp1.add(rgb);

   JPanel jp2=new JPanel(new GridLayout(2,1));
          jp2.add(jp);jp2.add(jp1);

          getContentPane().add(jp2,"North");

         rkb.addActionListener(this);
         rmb.addActionListener(this);
         rgb.addActionListener(this);

         setSize(500,200);
         setVisible(true);

       }

       public void actionPerformed(ActionEvent ae)
        {
          JRadioButton rb=(JRadioButton)ae.getSource();
            value=Double.parseDouble(jtf1.getText());
           if(rb==rkb)           
            result=value/1024;
            if(rb==rmb)
              result=(value/1024)/1024;
             if(rb==rgb)
             result=(value/1024)/1024/1024;
            
		jtf2.setText(String.valueOf(result));  
        }
        public static void main(String args[])
        {
         RadioDemo rd=new RadioDemo();
        }
    } 