/*
JToggleButton:
An implementation of a two-state button. The JRadioButton and JCheckBox classes are subclasses of this class

JToolBar:
JToolBar provides a component that is useful for displaying commonly used Actions or controls.

With most look and feels, the user can drag out a tool bar into a separate window (unless the floatable property is set to false)
*/

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class ToolBarDemo extends JFrame
{
   private JToolBar jtb;
   private JToggleButton jtb1,jtb2,jtb3;

     public ToolBarDemo()
 	{
jtb=new JToolBar();

jtb1=new JToggleButton(new ImageIcon("images\\cut.gif"),true);

jtb2=new JToggleButton(new ImageIcon("images\\copy.gif"));

jtb3=new JToggleButton(new ImageIcon("images\\print.gif"));

jtb.setFloatable(false);
jtb.setRollover(true);


 //adding buttons to the toolbar
	jtb.add(new JButton("Print"));
 	jtb.add(jtb1); 	jtb.add(jtb2); 	jtb.add(jtb3);

	jtb1.setToolTipText("Bold");
	jtb2.setToolTipText("Italic");
	jtb3.setToolTipText("UnderLine");

 //adding toolbar to the frame in north region
	getContentPane().add(jtb,"North");
	setDefaultCloseOperation(3);
	setSize(300,300);
   setVisible(true);
      }
	public static void main(String args[])
	{
	ToolBarDemo tb=new ToolBarDemo();
     }
}
