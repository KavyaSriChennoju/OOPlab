import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventDemo extends Frame implements ItemListener
{
 private Choice ch;
 private TextField tf;
 private String items[]={"java","asp","jsp","html","dhtml"};

 public ItemEventDemo()
   {
    tf=new TextField();
	ch=new Choice();

	 for(int i=0;i<items.length;i++)
	   ch.addItem(items[i]);

	 ch.addItemListener(this);
	 add(ch,BorderLayout.NORTH);
	 add(tf,BorderLayout.SOUTH);
	 setSize(300,300);
	 setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	 {
	   String str=ch.getSelectedItem();
	   tf.setText("Your selected item is..>"+str);
	 }
   public static void main(String args[])
    {
	 ItemEventDemo iev=new ItemEventDemo();
	}
 }