import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class SearchMenu extends Frame implements ActionListener
{
  private MenuItem mi;
  private Menu search;
  private MenuBar mb;
  private MyDialog md;
  
  public SearchMenu()
   {
   	 mi=new MenuItem("Find");
	 search=new Menu("Search");
	 md=new MyDialog(this);  
	 search.add(mi);
	 mb=new MenuBar();
	 mb.add(search);
	 setMenuBar(mb);
	 mi.addActionListener(this);
	 setSize(300,300);
	 show();
	}
	
	public void actionPerformed(ActionEvent ae)
	 {
	  md.show();
	 }
	 
	 public static void main(String args[])
	  {
	   SearchMenu sm=new SearchMenu(); 
	  }
}	  
	  
class MyDialog extends Dialog
 {
    private TextField tf;
	
	public MyDialog(Frame f)
	{
	 super(f);
	 tf=new TextField(30);
	 setLayout(new FlowLayout());
	 add(new Label("Find What"));
	 add(tf);
	 setTitle("Find");
	 setSize(450,100);
	 
	 }
}	 
	 
	
	 
  