/*
Choice class:
	The Choice class presents a pop-up menu of choices. The current choice is displayed as the title of the menu.(drop down list)

List class:
	The List component presents the user with a scrolling list of text items. The list can be set up so that the user can choose either one item or multiple items. 
*/

import java.io.*;
import java.awt.*;
public class ChoiceTest extends Frame
 {
  private List list;
  private Choice ch;
  
   public ChoiceTest()
    {
     list=new List(4,true);
     ch=new Choice();
	 
     list.add("java");
     list.add("asp");
     list.add("html");
     list.add("jsp");
     list.add("php");

     ch.add("bdps");
     ch.add("niit");
     ch.add("aptech");
	 
    add(list,BorderLayout.NORTH);
    add(ch,BorderLayout.SOUTH);

     setSize(300,300);
     setVisible(true);
    }
   public static void main(String args[])
     {
      ChoiceTest cht=new ChoiceTest();
     }
   }