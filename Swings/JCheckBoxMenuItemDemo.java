import java.io.*;
import java.awt.*;
import javax.swing.*;

public class JCheckBoxMenuItemDemo extends JFrame
{
 private JCheckBoxMenuItem jcm1,jcm2,jcm3;
 private JMenu checkboxmenu;
 private JMenuBar jmb;
 private ButtonGroup bgp;

 public JCheckBoxMenuItemDemo()
 {
    setTitle("JCheckBoxMenuItem");
   checkboxmenu=new JMenu("Java");
   
    bgp=new ButtonGroup();
	
   jcm1=new JCheckBoxMenuItem("Java SE");
   jcm2=new JCheckBoxMenuItem("Java EE",
   new ImageIcon("IMAGES//home-icon.png"),true);
 jcm3=new JCheckBoxMenuItem("Java ME");


     //adding JCheckBoxMenuItems to the menu
       checkboxmenu.add(jcm1);
      checkboxmenu.add(jcm2);
        checkboxmenu.add(jcm3);

      jmb=new JMenuBar();
        //adding checkboxmenu to the menubar
        jmb.add(checkboxmenu);

     //adding menubar to the frame
      setJMenuBar(jmb);
      setDefaultCloseOperation(3);
      setSize(200,200);
      setVisible(true);
    }
    public static void main(String argsp[])
     {
        JCheckBoxMenuItemDemo rm=new JCheckBoxMenuItemDemo();
     }
 }



