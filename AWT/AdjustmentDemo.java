import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class AdjustmentDemo extends Frame implements AdjustmentListener
{
  private Label lred,lgreen,lblue;
  private Scrollbar sred,sgreen,sblue;

   public AdjustmentDemo()
    {
	lred=new Label("Red");
	lgreen=new Label("Green");
	lblue=new Label("Blue");

sred=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,275);
sgreen=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,275);
sblue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,275);

    Panel p=new Panel(new GridLayout(3,2));
	p.add(lred);p.add(sred);
	p.add(lgreen);p.add(sgreen);
	p.add(lblue);p.add(sblue);

 /*sred.setBackground(Color.red);
	  sblue.setBackground(Color.blue);
	  	  sgreen.setBackground(Color.green);*/

	sred.addAdjustmentListener(this);
	sgreen.addAdjustmentListener(this);
	sblue.addAdjustmentListener(this);

     add(p,BorderLayout.SOUTH);
	setSize(400,400);
	setVisible(true);
       }
 public void adjustmentValueChanged(AdjustmentEvent ae)
	 {
Color color=new Color(sred.getValue(),sgreen.getValue(),sblue.getValue());
      setBackground(color);
      }
        public static void main(String args[])
           {
 AdjustmentDemo ad=new AdjustmentDemo();
           }
}





