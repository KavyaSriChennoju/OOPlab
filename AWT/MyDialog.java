import java.io.*;
import java.awt.*;

public class MyDialog extends Dialog
 {
   private Button bt;
   private Label lb;
   
   public MyDialog(Frame f)
    {
	  super(f);
	  bt=new Button("click me");
	  lb=new Label("Welcome ...");
	  
	  setLayout(new FlowLayout());
	  add(lb);add(bt);
	   setSize(100,200);
		setVisible(true);
	}
}