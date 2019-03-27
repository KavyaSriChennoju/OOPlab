
import java.io.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FileMenu extends JMenu implements ActionListener
 {
   private JMenuItem fnew,fsave,fopen,fexit;
   private JFileChooser jfc;
//     private String fname;
   public FileMenu()
    {
      super("File");
      setMnemonic('f');
      jfc=new JFileChooser();

      fnew=new JMenuItem("New");
      fsave=new JMenuItem("Save");
      fopen=new JMenuItem("Open");
      fexit=new JMenuItem("Exit");

      fnew.setMnemonic('n');
      fsave.setMnemonic('s');
      fopen.setMnemonic('o');
      fexit.setMnemonic('x');

      fnew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,2));
      fsave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,2));
      fopen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,2));
      fexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,2));

      fnew.addActionListener(this);
      fsave.addActionListener(this);
      fopen.addActionListener(this);
      fexit.addActionListener(this);

      add(fnew);
      add(fsave);
      add(fopen);
      addSeparator();
      add(fexit);
    }
    public void actionPerformed(ActionEvent ae)
     {
       JMenuItem jmi=(JMenuItem)ae.getSource();
        if(jmi==fnew)
         {
          JFrame jf=new JFrame("New Frame");
          jf.setBounds(200,200,100,100);
          jf.setVisible(true);
         }
        else if(jmi==fsave)
           jfc.showSaveDialog(FileMenu.this);
        else if(jmi==fopen)
             {
        int opt=jfc.showOpenDialog(FileMenu.this);
         if(opt==jfc.APPROVE_OPTION)
	          {
	       TextPad.jta.setText("");
	           try
	             {
	        File fname=jfc.getSelectedFile();
	BufferedReader br=new BufferedReader(new FileReader(fname));
		String str;
                while( (str=br.readLine()) !=null)
              TextPad.jta.append(str+"\n");
		}catch(Exception ie)
 		{
		  TextPad.jta.setText(ie.getMessage());
                                        }

                      }
			}
        else
         System.exit(0);
  }
}