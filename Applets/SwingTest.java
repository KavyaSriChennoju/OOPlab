import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingTest extends JApplet implements ActionListener
 {
   private JTextField ta;
   private String str;    
  private Color colors[]={Color.red,Color.green,Color.blue,Color.yellow,Color.pink,Color.orange};
   
   public void init()
    {
      ta=new JTextField(30);
     str=new String("");
     getContentPane().add(ta,"North");
      ta.addActionListener(this);
    }
 public  void actionPerformed(ActionEvent ae)
    {
         str=ta.getText();
         repaint();
   }
   public void paint(Graphics g)
    {
    g.setFont(new Font("Arial",Font.BOLD,20));
           try
           {
	int col=0;
              for(int i=40;i<200;i=i+20)
               {  
	   g.drawString(str,i,i);
            g.setColor(colors[col]);
              Thread.sleep(40);
                        col++;
                      if(col >colors.length)
                      col=0;                       
                }
            }catch(Exception ie)
          {
              
           }
		 }
 } 

             



