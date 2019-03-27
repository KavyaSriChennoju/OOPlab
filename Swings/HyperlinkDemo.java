import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class HyperlinkDemo extends JFrame implements HyperlinkListener
{
  private JEditorPane jep;

  public HyperlinkDemo()
  {
     try
      {
       jep=new JEditorPane();
       jep.setEditable(false);
       jep.setPage("file:///d:\\jdk1.3\\readme.html");
      }
      catch(Exception e)
       {
         jep.setText(e.getMessage());
       }
       jep.addHyperlinkListener(this);
       getContentPane().add(jep);
       setSize(300,300);
       show();
   }
     public void hyperlinkUpdate(HyperlinkEvent he)
     {
      if(HyperlinkEvent.EventType.ACTIVATED==he.getEventType())
       {
         try
         {
           jep.setPage(he.getURL());

         }catch(Exception ie)
          {
           System.out.println(ie.getMessage());
          }
        
       }

     }

   public static void main(String args[])
    {
     HyperlinkDemo epd=new HyperlinkDemo();
    }
 }

