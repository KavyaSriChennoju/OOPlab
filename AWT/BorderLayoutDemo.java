/*
A border layout lays out a container,
arranging and resizing its components to fit
in five regions: north, south, east, west,
and center. Each region may contain no more
than one component, and is identified by a
corresponding constant: NORTH, SOUTH, EAST,
WEST, and CENTER. When adding a component
to a container with a border layout,
use one of these five constants.

BorderLayout()
          Constructs a new border layout
		  with no gaps between components.

BorderLayout(int hgap, int vgap)
   Constructs a border layout with
the specified gaps between
components.

int getHgap()
          Returns the horizontal gap
		  between components.
int getVgap()
          Returns the vertical gap between
		  components.
void setHgap(int hgap)
          Sets the horizontal gap between
		  components.
 void setVgap(int vgap)
          Sets the vertical gap between components

*/
import java.io.*;
import java.awt.*;

public class BorderLayoutDemo extends Frame
{
  private Button cbt,nbt,sbt,ebt,wbt;

  public BorderLayoutDemo()
   {
    cbt=new Button("center");
    nbt=new Button("North");
    ebt=new Button("East");
    wbt=new Button("West");
    sbt=new Button("South");
/*
 BorderLayout bt=new BorderLayout();
      bt.setHgap(10);
      bt.setVgap(10);

	setLayout(bt);
*/

//setLayout(new BorderLayout(10,10));


	String reg=BorderLayout.WEST;
    add(wbt,reg);

    add(nbt,BorderLayout.NORTH);
    add(ebt,BorderLayout.EAST);


    add(sbt,"South");
    add(cbt);//by default in center.

    setSize(300,300);
    setVisible(true);
   }
   public static void main(String args[])
    {
     BorderLayoutDemo bld=new BorderLayoutDemo();
    }
 }