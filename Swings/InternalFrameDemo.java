/*
SDI-Singl Document Interface (ex: NotePad)
MDI-Multiple Document Interface.(ex.MS-Word)

JInternalFrame
	A lightweight object that provides many of the features of a native frame, including dragging, closing, becoming an icon, resizing, title display, and support for a menu bar.

Generally, you add JInternalFrames to a JDesktopPane. The UI delegates the look-and-feel-specific actions to the DesktopManager object maintained by the JDesktopPane.

			constructors
JInternalFrame()
  Creates a non-resizable, non-closable, non-maximizable, non-iconifiable JInternalFrame with no title.

JInternalFrame(String title, boolean resizable, boolean closable, boolean maximizable)
    Creates a non-iconifiable JInternalFrame with the specified title, resizability, closability, and maximizability.

JInternalFrame(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable)
      Creates a JInternalFrame with the specified title, resizability, closability, maximizability, and iconifiability.

*/

import java.io.*;
import java.awt.*;
import javax.swing.*;

public class InternalFrameDemo extends JFrame
{
 private JInternalFrame iframe;
 private JDesktopPane jdesk;

 public InternalFrameDemo()
  {
      super("Main Frame");

   jdesk=new JDesktopPane();
   setContentPane(jdesk);
   setSize(300,300);
   setVisible(true);

   iframe=new JInternalFrame("Internal Frame",true,true,true,true);

  JInternalFrame if2=new JInternalFrame("hai",true,true);

  //adding internal frames to the  JDesktopPane
         jdesk.add(iframe);
       jdesk.add(if2);

   //adding a component to internal frame.
    iframe.getContentPane().add(new JTextArea());
	iframe.reshape(100,100,150,150);

		if2.reshape(150,150,200,200);
		if2.show();
	iframe.show();
  }
     public static void main(String args[])
	   {
InternalFrameDemo ifd=new  InternalFrameDemo();
	   }
}


