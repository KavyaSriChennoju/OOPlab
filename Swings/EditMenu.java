import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EditMenu extends JMenu
{
  public JMenuItem ecut,ecopy,epaste,eselect;

  public EditMenu()
  {
	super("Edit");
	setMnemonic('e');

	ecut=new JMenuItem("Cut");
	ecopy=new JMenuItem("Copy");
	epaste=new JMenuItem("Paste");
	eselect=new JMenuItem("Select All");

//adding shortcuts (alt keys)
	ecut.setMnemonic('t');
	ecopy.setMnemonic('c');
	epaste.setMnemonic('p');
	eselect.setMnemonic('a');

//adding ctrl keys
	ecut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,2));
	ecopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,2));
	epaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,2));
    eselect.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,2));

//adding menuitems to the menu
    add(ecut);
    add(ecopy);
    add(epaste);
    addSeparator();
    add(eselect);
 }

 /*getKeyStroke
public static KeyStroke getKeyStroke(int keyCode,int modifiers)
  Returns a shared instance of a KeyStroke, given a numeric key code and a set of modifiers. The returned KeyStroke will correspond to a key press.

The "virtual key" constants defined in java.awt.event.KeyEvent can be used to specify the key code. For example:

java.awt.event.KeyEvent.VK_ENTER
java.awt.event.KeyEvent.VK_TAB
java.awt.event.KeyEvent.VK_SPACE

The modifiers consist of any combination of:
	java.awt.event.InputEvent.SHIFT_MASK (1)
	java.awt.event.InputEvent.CTRL_MASK (2)
	java.awt.event.InputEvent.META_MASK (4)
	java.awt.event.InputEvent.ALT_MASK (8)

Since these numbers are all different powers of two, any combination of them is an integer in which each bit represents a different modifier key. Use 0 to specify no modifiers.
*/
}
