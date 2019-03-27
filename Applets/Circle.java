import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Circle extends Applet implements ActionListener
{
  private Button cb,rb,ob;
  private int shape;

  public void init()
   {
  	 cb=new Button("Circle");
	 rb=new Button("Rectangle");
	 ob=new Button("Oval");

	 cb.addActionListener(this);
	 rb.addActionListener(this);
	 ob.addActionListener(this);

	 Panel p=new Panel();
	 p.add(cb);p.add(rb);p.add(ob);
	 add(p,BorderLayout.NORTH);
  }
public void actionPerformed(ActionEvent ae)
	 {
	  Button bt=(Button)ae.getSource();
	   if(bt==cb)
	      shape=1;
	    else if(bt==rb)
		shape=2;
	 else
		shape=3;
		repaint();
     }

	 public void paint(Graphics g)
	  {
	    Graphics2D g2=(Graphics2D)g;
	Rectangle rec=new Rectangle(120,90,100,100);
		g2.setColor(Color.red);
	g2.setStroke(new BasicStroke(5.0f));
	   	if(shape==1)
		{
		// g2.fillOval(50,50,300,300);
		//g2.clip(rec);
		//g2.draw(rec);

	 g2.fillOval(50,50,200,200);
		 }
		else if(shape==2)
		{
    	g2.drawRect(50,50,200,200);
		 // g2.draw(rec);
		  }
		 else
		 {
		   g2.drawOval(50,50,150,250);

		    Polygon pol=new Polygon();
			pol.addPoint(20,45);
			pol.addPoint(45,75);
			pol.addPoint(75,195);
			pol.addPoint(80,65);
			g2.draw(pol);
		 }
	  }
	}