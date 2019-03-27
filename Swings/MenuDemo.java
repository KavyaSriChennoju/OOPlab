/*
 menuitems->menu->menubar->JFrame
*/

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo  extends JFrame  implements ActionListener
 {
   private JMenuItem fnew,fsave,fopen,fexit;
   private JMenu file;
   private JMenuBar jmb;

   public MenuDemo()
    {
      fnew=new JMenuItem("New");
      fsave=new JMenuItem("Save");
      fopen=new JMenuItem("Open");
      fexit=new JMenuItem("Exit");

        fexit.addActionListener(this);

      file=new JMenu("File");

	  //adding menuitems to the file menu
      file.add(fnew);
      file.add(fsave);
      file.add(fopen);
      file.addSeparator();
      file.add(fexit);

        jmb=new JMenuBar();
		//addint file menu to the menubar
      jmb.add(file);

	  //adding menubar to the JFrame
      setJMenuBar(jmb);

      setSize(300,300);
       setVisible(true);
    }
 public void actionPerformed(ActionEvent ae)
 {
   int yn=JOptionPane.showConfirmDialog(MenuDemo.this,"Do you want to Close");
      if(yn==JOptionPane.YES_OPTION)
             System.exit(0);
}
    public static void main(String argg[])
     {
      MenuDemo md=new MenuDemo();
     }
}

