
//menuitems->menus->menubar->frame

import java.awt.*;
import java.io.*;

public class MyMenu extends Frame
 {
  private MenuItem newItem,saveItem,exitItem,cut,copy;
  private Menu file,edit;
  private MenuBar mb;

  public MyMenu()
   {
    newItem=new MenuItem("New");
	saveItem=new MenuItem("Save As...");
	exitItem=new MenuItem("Exit");


	cut=new MenuItem("Cut");
	copy=new MenuItem("Copy");

	edit=new Menu("Edit");
	edit.add(cut);
	edit.add(copy);

	file=new Menu("File");
	file.add(newItem);
	file.add(saveItem);
	file.addSeparator();
	file.add(exitItem);

	//file.add(edit);

//adding menus to the menubar
	mb=new MenuBar();
	mb.add(file);
   mb.add(edit);

//adding menubar to the frame
	setMenuBar(mb);
	setSize(300,300);
	setVisible(true);
	}
	public static void main(String[] aggs)
	{
	 MyMenu mm=new MyMenu();
	 }
}
