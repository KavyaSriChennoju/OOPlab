import java.awt.*;
import javax.swing.*;

public class ToolBarDemo2 extends JFrame
{
  private JToggleButton bold,italic,underline,left,right,center;
  private JToolBar jtb;
  private ButtonGroup bgp;

 public ToolBarDemo2()
 {
   setTitle("JToggleButton, JToolBar");
    bold=new JToggleButton(new ImageIcon("images/bold.gif"));
    italic=new JToggleButton(new ImageIcon("images/italic.gif"));
    underline=new JToggleButton(new ImageIcon("images/underline.gif"));


left=new JToggleButton(new ImageIcon("images/left.gif"));
center=new JToggleButton(new ImageIcon("images/center.gif"));
right=new JToggleButton(new ImageIcon("images/right.gif"));


    bgp=new ButtonGroup();
    //adding left,right,center buttons to the ButtonGroup
    bgp.add(left);bgp.add(center);bgp.add(right);


    jtb=new JToolBar();
    //adding buttons to the toolbar

    jtb.add(bold);jtb.add(italic);jtb.add(underline);
    jtb.addSeparator();
    jtb.add(left);jtb.add(center);jtb.add(right);

//jtb.setFloatable(false);
 jtb.setRollover(true);

    //adding toolbar to the JFrame
    getContentPane().add(jtb,"North");
  setDefaultCloseOperation(3);
    setSize(300,300);
    setVisible(true);
 }

 public static void main(String args[])
 {
  ToolBarDemo2 tbd=new ToolBarDemo2();
 }

}