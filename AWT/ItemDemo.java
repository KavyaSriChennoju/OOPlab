 import java.awt.*;
 import java.awt.event.*;
 
 public class ItemDemo extends Frame implements ItemListener
 {
   String cname[]={"India","Nepal","Pakistan","Japan","usa","kenda"};
   String capitals[]={"New Delhi","Khatmandu","Islamabad","tokyo","New York","Ottava"};
   
   private Choice ch;
   private TextField tf;
   
   public ItemDemo()
   {
    ch=new Choice();
	tf=new TextField();
	for(int i=0;i<cname.length;i++)
	 ch.addItem(cname[i]);
	 
	 ch.addItemListener(this);
	 	 
		 add(ch,"North");
		 add(tf,"South");
		 
		 setSize(300,300);
		 setVisible(true);
   }
 public void itemStateChanged(ItemEvent ie)
   {
    int index=ch.getSelectedIndex();
	String cap=capitals[index];
	tf.setText("Capital is..."+cap);
      }
	  public static void main(String args[])
	   {
	    ItemDemo id=new ItemDemo();	   
	   }
 }
 