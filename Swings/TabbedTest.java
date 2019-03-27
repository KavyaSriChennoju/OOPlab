/*
JTabbedPane:
		A component that lets the user switch between a group of components by clicking on a tab with a given title and/or icon.

Tabs/components are added to a TabbedPane object by using the addTab and insertTab methods. A tab is represented by an index corresponding to the position it was added in, where the first tab has an index equal to 0 and the last tab has an index equal to the tab count minus 1.

JTabbedPane()
      Creates an empty TabbedPane with a default tab placement of JTabbedPane.TOP and default tab layout policy of JTabbedPane.WRAP_TAB_LAYOUT.


public JTabbedPane(int tabPlacement,  int tabLayoutPolicy)

Creates an empty TabbedPane with the specified tab placement and tab layout policy.
Tab placement may be either:						JTabbedPane.TOP,					JTabbedPane.BOTTOM,				JTabbedPane.LEFT, or				JTabbedPane.RIGHT.

Tab layout policy may be either:
     JTabbedPane.WRAP_TAB_LAYOUT
 or JTabbedPane.SCROLL_TAB_LAYOUT.
*/

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class TabbedTest extends JFrame
{
      private JTabbedPane jtp;

       public TabbedTest()
         {
setTitle("JTabbedPane");
//jtp=new JTabbedPane();
jtp=new JTabbedPane(JTabbedPane.BOTTOM,JTabbedPane.SCROLL_TAB_LAYOUT);

JPanel jp=new JPanel(new GridLayout(2,2));
	jp.add(new JLabel("First Name"));
	jp.add(new JTextField(20));
	jp.add(new JLabel("Phone Number"));
	jp.add(new JTextField(20));

jtp.addTab("Information",new JButton("Hello"));
jtp.addTab("Student",new ImageIcon("images\\download.png"),jp);
jtp.addTab("FeedBack",new ImageIcon("images\\home-icon.png"),new JTextArea(30,50),"Please Fill the text");

	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().add(jtp);
	setSize(320,250);
	setVisible(true);
     }
	public static void main(String args[])
	{
	 TabbedTest tt=new TabbedTest();
	}
}