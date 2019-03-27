import java.awt.*;
import java.net.*;
import java.applet.*;

public class showDoc extends Applet
{

   public void init()
    {
     AppletContext acon=getAppletContext();
     try
      {
        URL myurl=new URL("http://www.yahoo.com");
        acon.showDocument(myurl);
      }
      catch(Exception e)
      {
       System.out.println(e.getMessage());
      }
    }
 }

     

