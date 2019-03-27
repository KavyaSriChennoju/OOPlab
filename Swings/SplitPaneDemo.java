/*
JSplitPane is used to divide two (and only two) Components. The two Components are graphically divided based on the look and feel implementation, and the two Components can then be interactively resized by the user.

The two Components in a split pane can be aligned left to right using JSplitPane.HORIZONTAL_SPLIT, or top to bottom using JSplitPane.VERTICAL_SPLIT.
*/
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class SplitPaneDemo extends JFrame
{
	private JSplitPane jsp;
	private JList jl;
	private JButton jb;
	private String items[]={"lux","santoor","breeze","rose","detol","hansol","lux","santoor","breeze","rose","detol","hansol"};

   public SplitPaneDemo()
     {
	setTitle("JSplitPane Demo");
	  jl=new JList(items);
JScrollPane jpane=new JScrollPane(jl);
	jb=new JButton("Button 1");
jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jpane,jb);

	jsp.setOneTouchExpandable(true);
	jsp.setDividerSize(20);

	JSplitPane jsp1=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jsp,new JTextArea());
	
	setDefaultCloseOperation(3);
	getContentPane().add(jsp1);
	setSize(300,300);
	setVisible(true);
       }
    public static void main(String args[])
	{
	 SplitPaneDemo spd=new SplitPaneDemo();
	}
}      	 