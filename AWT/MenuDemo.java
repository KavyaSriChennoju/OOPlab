 import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener
{
  private MenuItem fsave,fopen,fnew,fexit;
  private Menu filemenu;
  private MenuBar mb;
  private FileDialog fd;
  private TextArea ta;

  public MenuDemo()
   {
   ta=new TextArea();
    fd=new FileDialog(MenuDemo.this);

    MenuShortcut mc=new MenuShortcut(KeyEvent.VK_N);
	fnew=new MenuItem("New",mc);

	fsave=new MenuItem("Save...",new MenuShortcut(KeyEvent.VK_S));

	fopen=new MenuItem("Open...",new MenuShortcut(KeyEvent.VK_O));

	fexit=new MenuItem("Exit",new MenuShortcut(KeyEvent.VK_E));

	filemenu=new Menu("File");

	filemenu.add(fnew);
	filemenu.add(fsave);
	filemenu.add(fopen);
	filemenu.addSeparator();
	filemenu.add(fexit);

	mb=new MenuBar();
	mb.add(filemenu);

	 fsave.addActionListener(this);
	 fexit.addActionListener(this);
	 fopen.addActionListener(this);
	 fnew.addActionListener(this);

	add(ta);	//adding textarea to the frame
	 setMenuBar(mb); //adding menubar to frame
	 setSize(300,300);
	 setVisible(true);
	}

public void actionPerformed(ActionEvent ae)
	 {
   MenuItem me=(MenuItem)ae.getSource();
	   if(me==fsave)
	    {
			//showing the save dialog box
		  fd.setTitle("Save File");
	fd.setMode(FileDialog.SAVE);
	fd.show();
		 }
		else if(me==fopen)
		{
		 fd.setTitle("Open a File");
		 fd.setMode(FileDialog.LOAD);
		  fd.show();
		 }
		else if(me==fnew)
		 {
		   Frame f=new Frame("New Frame");
		   f.setBounds(200,200,200,200);
		   f.setVisible(true);
		 }
		else
		 System.exit(0);
	 }
	public static void main(String args[])
	 {
	  MenuDemo md=new MenuDemo();
	 }
}

