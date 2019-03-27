import java.awt.*;
import java.awt.event.*;

public class MyWindowListener extends WindowAdapter
 {
  public void windowClosing(WindowEvent we)
       {
            System.exit(0);
       }
public void windowActivated(WindowEvent we)
       {
     System.out.println("Window is activated");
      }
}