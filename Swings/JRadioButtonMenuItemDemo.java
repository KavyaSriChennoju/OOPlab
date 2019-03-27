import java.io.*;
import java.awt.*;
import javax.swing.*;

public class JRadioButtonMenuItemDemo extends JFrame
{
 private JRadioButtonMenuItem radio1,radio2,radio3;
 private JMenu menu;
 private JMenuBar jmb;
 private ButtonGroup bgp;

 public JRadioButtonMenuItemDemo()
 {
    setTitle("JRadioMenuItem");
  menu=new JMenu("Java");
  
    bgp=new ButtonGroup();
	
    radio1=new JRadioButtonMenuItem("Java SE",new ImageIcon("images\\javalogo.png"),true);
   radio2=new JRadioButtonMenuItem("Java EE");
   radio3=new JRadioButtonMenuItem("Java ME");
		bgp.add(radio1);
		bgp.add(radio2);
		bgp.add(radio3);
		
      menu.add(radio1);
      menu.add(radio2);
   menu.add(radio3);

        jmb=new JMenuBar();
    jmb.add(menu);

      setJMenuBar(jmb);
      setDefaultCloseOperation(3);
      setSize(200,200);
      setVisible(true);
    }
    public static void main(String argsp[])
     {
        JRadioButtonMenuItemDemo rm=new JRadioButtonMenuItemDemo();
     }
 }



