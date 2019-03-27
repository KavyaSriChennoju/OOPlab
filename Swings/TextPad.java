import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextPad extends JFrame implements ActionListener
{

	//userdefined classes
  private FileMenu fm;
  private EditMenu em;

  private JMenuBar jmb;
  public static JTextArea jta;

   public TextPad()
    {
     super("Note Pad");
     jmb=new JMenuBar();

     fm=new FileMenu();
     em=new EditMenu();

//adding filemenu and editmenu to the menubar
     jmb.add(fm);
     jmb.add(em);

     jta=new JTextArea();
     JScrollPane jsp=new JScrollPane(jta);

	 em.ecut.addActionListener(this);
	 em.ecopy.addActionListener(this);
	em.epaste.addActionListener(this);
	em.eselect.addActionListener(this);

	//adding menubar to the frame
	setJMenuBar(jmb);

	jta.setMargin(new Insets(0,20,0,0));
	getContentPane().add(jsp);

     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(300,300);
     setVisible(true);
    }
      public void actionPerformed(ActionEvent ae)
        {
    	JMenuItem jmi=(JMenuItem)ae.getSource();
		if(jmi==em.ecut)
	           jta.cut();
	 else if(jmi==em.ecopy)
	       jta.copy();
	 else if(jmi==em.epaste)
	          jta.paste();
	 else
	     jta.selectAll();
        }

    public static void main(String argg[])
     {
       TextPad md=new TextPad();
     }
}


