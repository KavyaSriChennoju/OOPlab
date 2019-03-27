import java.io.*;
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LocaleDemo extends JFrame implements ItemListener
 {
  private JComboBox jcb;
  private JLabel locale,result;
  private JTextField tf;
  private final double value=34676.5656;
 private NumberFormat nf;
 private Locale loc[];
  
  public LocaleDemo()
   {
    jcb=new JComboBox();
	locale=new JLabel("Avilable Locales");
	result=new JLabel("Result");
	
	tf=new JTextField();
    loc=Locale.getAvailableLocales();
	for(int i=0;i<loc.length;i++)
	 {
	  jcb.addItem((Object)loc[i].toString());
	 }
	 
     nf=NumberFormat.getCurrencyInstance(Locale.getDefault());
     tf.setText(nf.format(value)) ;                   	 

	 JPanel jp=new JPanel(new GridLayout(2,2));
	 jp.add(locale);jp.add(jcb);
	 jp.add(result);jp.add(tf);
	 jcb.addItemListener(this);
	 getContentPane().add(jp,"North");
	 setSize(300,300);
	 show();
	}
	public void itemStateChanged(ItemEvent ie)
 	{
	  int index=jcb.getSelectedIndex();
      Locale myloc=loc[index];
	  nf=NumberFormat.getCurrencyInstance(myloc);
	  tf.setText(nf.format(value));
	 }
	public static void main(String args[])
	 {
	  LocaleDemo ld=new LocaleDemo();
	  }
}  
  
