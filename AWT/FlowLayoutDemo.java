/*
A flow layout arranges components
in a left-to-right flow, much like
lines of text in a paragraph. Flow
layouts are typically used to arrange
buttons in a panel. It will arrange buttons
left to right until no more buttons fit on
the same line. Each line is centered.
*/

import java.io.*;
import java.awt.*;

public class FlowLayoutDemo extends Frame
{
 private Button bt1,bt2,bt3;

   public FlowLayoutDemo()
    {
     bt1=new Button("Button 1");
     bt2=new Button("Button 2");
     bt3=new Button("Button 3");

FlowLayout fl=new FlowLayout(FlowLayout.LEFT);

//FlowLayout fl=new FlowLayout();
     setLayout(fl);

//adding buttons to the frame
      add(bt1);add(bt2);add(bt3);

	add(new Button("Button4"));
	add(new Button("button5"));

      setSize(300,300);
      setVisible(true);
     }
     public static void main(String args[])
      {
   FlowLayoutDemo fld=new FlowLayoutDemo();
      }
  }

