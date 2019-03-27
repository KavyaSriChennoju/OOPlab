/*
The JTable is used to display and edit regular two-dimensional tables of cells

JTable(Object[][] rowData, Object[] columnNames)
          Constructs a JTable to display the values in the two dimensional array, rowData, with column names.
*/

import java.awt.*;
import javax.swing.*;

public class JTableDemo extends JFrame
{
 private String headings[]={"Name","Number","City","ZipCode"};

 private Object data[][]={
       {"scott",new Integer(253130),"paris",new Integer(520005)},
       {"sunny",new Integer(254199),"jersy",new Integer(5000016)},
       {"Rajesh",new Integer(252389),"jersy",new Integer(5000015)},
       {"Reddy",new Integer(252609),"uk",new Integer(534235)},
       {"Kishan",new Integer(252258),"paris",new Integer(520005)},
       {"Phani",new Integer(252309),"paris",new Integer(520005)},
       {"rajesh",new Integer(252033),"jersy",new Integer(500003)},
              {"Phani",new Integer(252309),"paris",new Integer(520005)},
	          {"rajesh",new Integer(252033),"jersy",new Integer(500003)},

       {"Phani",new Integer(252309),"paris",new Integer(520005)},
       {"rajesh",new Integer(252033),"jersy",new Integer(500003)},

       {"Srinu",new Integer(253235),"jersy",new java.util.Date()}
      };
 private JTable jtb;

 public JTableDemo()
   {
    setTitle("JTable Demo");
    jtb=new JTable(data,headings);

//jtb.setShowGrid(false);
// jtb.setShowVerticalLines(true);
jtb.setShowHorizontalLines(true);

 jtb.setColumnSelectionAllowed(true);
// jtb.setGridColor(Color.red);

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
      JTableDemo td=new JTableDemo();
     }
  }