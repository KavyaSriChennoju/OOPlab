/*
JComboBox:
	A component that combines a button or editable field and a drop-down list. The user can select a value from the drop-down list, which appears at the user's request. If you make the combo box editable, then the combo box includes an editable field into which the user can type a value.
*/

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboDemo extends JFrame implements ItemListener
{
private JComboBox jcb;
private String items[]={"java","asp","jsp","html","dhtml","novell"};
private JPasswordField jpf;

 public ComboDemo()
 {
     setTitle("JComboBox Demo");
          jcb=new JComboBox(items);
     jcb.addItemListener(this);

	jcb.setMaximumRowCount(3);
	jcb.setEditable(true);

	  jpf=new JPasswordField();
//	  jpf.setEchoChar('$');
jpf.setFont(new Font("Arial",Font.BOLD,20));
   jpf.setForeground(Color.blue);

		getContentPane().add(jcb,"North");
		getContentPane().add(jpf,"South");
	 	   setSize(300,300); show();
		  }
public void itemStateChanged(ItemEvent ie)
		   {
   System.out.print("Index is.."+jcb.getSelectedIndex());
 	System.out.println("....Item is..."+jcb.getSelectedItem());
		   }
	 public static void main(String args[])
		 {
		  ComboDemo cd=new ComboDemo();
		  }
}
