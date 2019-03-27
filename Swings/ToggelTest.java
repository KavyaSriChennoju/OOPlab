import java.io.*;
import java.awt.*;
import javax.swing.*;

public class ToggelTest extends JFrame
{
  private JToggleButton jtb1,jtb2,jtb3;

  public ToggelTest()
   {
    jtb1=new JToggleButton(new ImageIcon("c:\\windows\\hlpbell.gif"));
    jtb2=new JToggleButton("String only");
    jtb3=new JToggleButton("text/string/selected",new ImageIcon("c:\\windows\\hlpcd.gif"),true);


    JPanel jp=new JPanel(new GridLayout(1,3));
    jp.add(jtb1);    jp.add(jtb2);     jp.add(jtb3);


    getContentPane().add(jp,"North");
    setSize(300,300);
    setVisible(true);
   }

   public static void main(String args[])
    {
     ToggelTest tt=new ToggelTest();
    }
  }
