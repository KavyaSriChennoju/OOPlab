import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListCopy extends JFrame implements ActionListener
{
 private JButton jb1,jb2,jb3,jb4;
 private JList list1,list2;
 private JScrollPane jsp1,jsp2;
 private JPanel jp1,jp2,jp3;
 private String items[]={"java","asp","jsp","demo5","java","asp","jsp","demo5"};
 
 public ListCopy()
  {
   jb1=new JButton(">");
   jb2=new JButton("<");
   jb3=new JButton(">>");
   jb4=new JButton("<<");
   
   list1=new JList(items);
   list2=new JList();
   jsp1=new JScrollPane(list1);
   jsp2=new JScrollPane(list2);
   
   jp1=new JPanel(new GridLayout(2,1));
   jp1.add(jb1);jp1.add(jb2);
   
    jp2=new JPanel(new GridLayout(2,1));
   jp2.add(jb3);jp2.add(jb4);
   
   jp3=new JPanel(new GridLayout(2,3));
   jp3.add(new JLabel("List one"));
   jp3.add(jp1);
   jp3.add(new JLabel("List two"));
   jp3.add(jsp1);
   jp3.add(jp2);
   jp3.add(jsp2);
   
   jb1.addActionListener(this);
   jb2.addActionListener(this);
   jb3.addActionListener(this);
   jb4.addActionListener(this);
   getContentPane().add(jp3);
   setSize(300,300);
   show();
   }
   
   public void actionPerformed(ActionEvent ae)
    {
	 JButton jb=(JButton)ae.getSource();
	  if(jb==jb1)
	    list2.additems(list1.getSelectedValue());
	  
	
	
	}
	
	public static void main(String args[])
	 {
	  ListCopy li=new ListCopy();
	  }
	}  
   
   
   
   
