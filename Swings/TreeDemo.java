/*
JTree:
	A control that displays a set of hierarchicdal data as an outline.
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class TreeDemo extends JFrame implements TreeSelectionListener
{
  private JTree tree;
  private JTextField jtf;

   public TreeDemo()
    {
      setTitle("JTree Demo");
     DefaultMutableTreeNode prog=new DefaultMutableTreeNode("Languages");

      DefaultMutableTreeNode prog1=new
DefaultMutableTreeNode("C Languages");

      DefaultMutableTreeNode prog2=new DefaultMutableTreeNode("C++");
      DefaultMutableTreeNode prog3=new DefaultMutableTreeNode("Java");

      DefaultMutableTreeNode sub1=new DefaultMutableTreeNode("Java SE");
      DefaultMutableTreeNode sub2=new DefaultMutableTreeNode("Java EE");
      DefaultMutableTreeNode sub3=new DefaultMutableTreeNode("Java ME");
DefaultMutableTreeNode sub4=new DefaultMutableTreeNode("Data Structures");
DefaultMutableTreeNode sub5=new DefaultMutableTreeNode("Templates");

      prog.add(prog1);prog.add(prog2); prog.add(prog3);

      prog3.add(sub1);prog3.add(sub2);prog3.add(sub3);


         prog2.add(sub5);
		 prog1.add(sub4);

//adding root node to the JTree
         tree=new JTree(prog);
         jtf=new JTextField();

		 jtf.setEditable(false);

	tree.addTreeSelectionListener(this);

         getContentPane().add(tree);
         getContentPane().add(jtf,"South");
          setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(300,300);
         setVisible(true);
     }
 public void valueChanged(TreeSelectionEvent te)
       {
          TreeSelectionModel tm=tree.getSelectionModel();
      jtf.setText(tm.getSelectionPath().toString());
        }
     public static void main(String args[])
      {
       TreeDemo td=new TreeDemo();
      }
  }
