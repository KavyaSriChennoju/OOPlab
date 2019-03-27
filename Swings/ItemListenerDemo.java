import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo extends Frame implements ItemListener 
{
	private Choice ch;
	private TextField tf1;
	private String countries[]={"India","Nepal","Bangladesh","China","UK","USA"};
	private String capitals[]={"New Delhi","Khatmandu","Dhaka","Biching","London","Washington DC"};
	
	public ItemListenerDemo()
	{
		   
		   ch=new Choice();
		   for(String item:countries)
		   {
			   ch.add(item);
		   }
		   tf1=new TextField();
		 ch.addItemListener(this);
		   add(ch,"North");
		   add(tf1,"South");
		   setSize(300,300);
		   setVisible(true);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		int index=ch.getSelectedIndex();
		String cap=capitals[index];
		tf1.setText("Capital is..."+cap);
	}
	public static void main(String[] args) 
	{
	  ItemListenerDemo td=new ItemListenerDemo();   
	}
}
