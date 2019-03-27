import java.io.*;
import java.awt.*;

public class GridDemo extends Frame
 {
   private Label l1,l2,l3,l4;
   private TextField tf1,tf2,tf3,tf4;

   public GridDemo()
    {
//setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

   l1=new Label("Student Name");
   l2=new Label("Number",Label.RIGHT);
   l3=new Label("Read-only",Label.CENTER);
   l4=new Label("Default String",Label.LEFT);

   tf1=new TextField();
   tf2=new TextField();
   tf3=new TextField("bdps");
   tf4=new TextField();

  tf4.setText("default string");

   tf2.setEchoChar('*');

     tf3.setEditable(false);
     tf1.setBackground(Color.green);

     Color c=Color.red;
     tf1.setForeground(c);
     l4.setForeground(c);

     Font f=new Font("Arial",Font.BOLD,24);
     tf1.setFont(f);
     l1.setFont(f);

     l2.setFont(new Font("Arial Black",Font.ITALIC,20));

  setLayout(new GridLayout(4,2,20,10));

     add(l1);add(tf1);
     add(l2);add(tf2);
     add(l3);add(tf3);
     add(l4);add(tf4);

     setSize(300,300);
     setVisible(true);
     }
     public static void main(String args[])
      {
       GridDemo dt=new GridDemo();
      }
   }