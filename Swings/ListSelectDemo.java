import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListSelectDemo extends JFrame implements ListSelectionListener
{
  private JList country;
  private String cname[]={"India","Nepal","Japan","France","China"};
  private String capname[]={"New Delhi","Khatmandu","Tokyo","paris","Biching"};
  private JTextField tf;
  
  public ListSelectDemo()
  {
   super("List Selection listener Demo");
   country=new JList(cname);
   country.setVisibleRowCount(3);
   
   tf=new JTextField();
   JScrollPane jsp=new JScrollPane(country);  
   JPanel jp=new JPanel(new GridLayout(1,2));
   jp.add(new JLabel("Countries"));
   jp.add(jsp);
   
   country.addListSelectionListener(this);
   getContentPane().add(jp,"North");
   getContentPane().add(tf,"South");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   setSize(300,300);
   setVisible(true);
   }
     public void valueChanged(ListSelectionEvent le)
	  {
	    int index=country.getSelectedIndex();
		String str="Capital for "+cname[index]+"-> is.."+capname[index];
		tf.setText(str);
	  }
	  public static void main(String args[])
	   {
	    ListSelectDemo lsd=new ListSelectDemo();
		}
}		
  