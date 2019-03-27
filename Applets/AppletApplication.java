import java.io.*;
import java.awt.*;
import javax.swing.*;

public class AppletApplication extends JApplet
{ 
  private JButton jb;

   public void init()
    {
     jb=new JButton("Click Me");
  getContentPane().add(jb,"North");
    }

 public static void main(String args[])
     {
      JFrame jf=new JFrame();
JApplet jp=new AppletApplication();
      jp.init();
      jf.setContentPane(jp);                   
     jf.setBounds(300,300,100,100);
     jf.setVisible(true);
    }
 }

