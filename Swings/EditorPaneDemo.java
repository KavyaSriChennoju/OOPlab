import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.net.*;

public class EditorPaneDemo extends JFrame implements HyperlinkListener
{
 private JTextField jtf;
  private JEditorPane jep;
  public EditorPaneDemo()
  {
super("Hyper Link Listener in Editor pane");
	jtf=new JTextField();
	jtf.setEditable(false);
     try
      {
       jep=new JEditorPane();
       jep.setEditable(false);
       jep.setPage("file:///\\j2sdk1.4.0\\readme.html");
      }
      catch(Exception e)
       {
         jep.setText(e.getMessage());
       }
          jep.addHyperlinkListener(this);
     JScrollPane jsp=new JScrollPane(jep);
       getContentPane().add(jsp);
       getContentPane().add(jtf,"South");
       setSize(300,300);
       show();
   }
       public void hyperlinkUpdate(HyperlinkEvent he)
         {
       if(he.getEventType() == HyperlinkEvent.EventType.ACTIVATED) 
	    {
	       try
             {	jep.setPage(he.getURL());
	          }
	            catch(Exception e)
                   {
	                jep.setText(e.getMessage());
                     }
           }
	  if (he.getEventType() == HyperlinkEvent.EventType.ENTERED)
           jtf.setText(he.getURL().toString());
   if (he.getEventType() == HyperlinkEvent.EventType.EXITED)
               jtf.setText(""); 
	           } 
   public static void main(String args[])
    {
     EditorPaneDemo epd=new EditorPaneDemo();
    }
 }

