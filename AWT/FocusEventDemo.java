import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class FocusEventDemo extends  Frame implements FocusListener
{
  private TextField tm1,tm2,ttot;

   public FocusEventDemo()
    {
	tm1=new TextField();
	tm2=new TextField();
	ttot=new TextField();

   	ttot.addFocusListener(this);
	Panel p=new Panel(new GridLayout(3,2));
	p.add(new Label("Marks1"));p.add(tm1);
	p.add(new Label("Marks2"));p.add(tm2);
	p.add(new Label("Total"));p.add(ttot);

	add(p,BorderLayout.NORTH);
	setSize(300,300);
	setVisible(true);
    }
	public void focusGained(FocusEvent fe)
	 {
	 //retrieng text from textfield and converting into integer
	 String st=tm1.getText();
	int m1=Integer.parseInt(st);

	int m2=Integer.parseInt(tm2.getText());
	    int total=m1+m2;
	 ttot.setText(Integer.toString(total));
	}
	public void focusLost(FocusEvent fe)
	 {
	 	 tm1.setText("");
		 tm2.setText("");
		 ttot.setText("");
     }
public static void main(String args[])
  {
   FocusEventDemo fed=new FocusEventDemo();
 }
}