/*
The JTable is used to display and edit regular two-dimensional tables of cells

JTable(Object[][] rowData, Object[] columnNames)
          Constructs a JTable to display the values in the two dimensional array, rowData, with column names.
*/

import java.awt.*;
import javax.swing.*;

public class TableDemo extends JFrame
{
 private String headings[]={"Name","Number","City","ZipCode"};

 private Object data[][]={
       {"Paul",new Integer(253130),"Vijayawada",new Integer(520005)},
       {"Ramu",new Integer(254199),"Hyderabad",new Integer(5000016)},
       {"Rajesh",new Integer(252389),"Hyderabad",new Integer(5000015)},
       {"Reddy",new Integer(252609),"Akividu",new Integer(534235)},
       {"Kishan",new Integer(252258),"Vijayawada",new Integer(520005)},
       {"Phani",new Integer(252309),"Vijayawada",new Integer(520005)},
       {"rajesh",new Integer(252033),"Hyderabad",new Integer(500003)},
              {"Phani",new Integer(252309),"Vijayawada",new Integer(520005)},
	          {"rajesh",new Integer(252033),"Hyderabad",new Integer(500003)},

       {"Phani",new Integer(252309),"Vijayawada",new Integer(520005)},
       {"rajesh",new Integer(252033),"Hyderabad",new Integer(500003)},

       {"Srinu",new Integer(253235),"Hyderabad",new java.util.Date()}
      };
 private JTable jtb;

 public TableDemo()
   {
    jtb=new JTable(data,headings);

jtb.setShowGrid(false);
// jtb.setShowVerticalLines(true);
jtb.setShowHorizontalLines(true);

 jtb.setColumnSelectionAllowed(true);
 jtb.setGridColor(Color.red);

//jtb.setRowHeight(25);
// jtb.setSelectionBackground(Color.red);
//jtb.setSelectionForeground(Color.yellow);

    JScrollPane jsp=new JScrollPane(jtb);
  setDefaultCloseOperation(3);
    getContentPane().add(jsp);
    setSize(450,250);
    setVisible(true);
    }
    public static void main(String args[])
     {
      TableDemo td=new TableDemo();
     }
  }