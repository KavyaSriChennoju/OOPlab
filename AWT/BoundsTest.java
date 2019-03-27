import java.io.*;
import java.awt.*;

public class BoundsTest extends Frame
 {
    private Button but1,but2,but3;

       public BoundsTest()
       {
          super("Bounds test");
           setLayout(null);

            but1=new Button("Button1");	
            but2=new Button("Button2");
            but3=new Button("Button3");
          
                   but1.setBounds(20,20,50,50);
	but2.setBounds(80,80,50,50);
	but3.setBounds(140,140,50,50);
	
            add(but1);
           add(but2);add(but3);
             setSize(300,300);
	setVisible(true);
        }
       public static void main(String args[])
      {
             BoundsTest bt=new BoundsTest();
     }
}