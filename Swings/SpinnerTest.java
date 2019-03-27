/*
JSpinner:
	A single line input field that lets the user select a number or an object value from an ordered sequence. Spinners typically provide a pair of tiny arrow buttons for stepping through the elements of the sequence.

	A JSpinner's sequence value is defined by its SpinnerModel. The model can be specified as a constructor argument and changed with the model property. SpinnerModel classes for some common types are provided: SpinnerListModel, SpinnerNumberModel, and SpinnerDateModel
*/

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class SpinnerTest extends JFrame
{
  private JLabel number,list,date;
  private JSpinner snumber,slist,sdate;

  private String mylist[]={"java","asp","jsp","hello","hai"};

	  public SpinnerTest()
	   {
    super("Spinner Demo");
     number=new JLabel("Number Spinner(default)");
    list=new JLabel("List Spinner");
    date=new JLabel("Date Spinner");

    snumber=new JSpinner();
    slist=new JSpinner(new SpinnerListModel(mylist));
    sdate=new JSpinner(new SpinnerDateModel());

//adding components (JLabel and JSpinner) to the panel
  	JPanel jp=new JPanel(new GridLayout(3,2));
  	jp.add(number);jp.add(snumber);
  	jp.add(list);jp.add(slist);
	jp.add(date);jp.add(sdate);

//adding panel to the "North" region
  getContentPane().add(jp,"North");
  setSize(300,200);
    setVisible(true);
  }
  public static void main(String args[])
   {
    SpinnerTest spt=new SpinnerTest();
   }
 }