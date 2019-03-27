import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

public class colorchooser extends JFrame 
{
  private JLabel jl;
  
 public colorchooser()
  {

   setTitle("JColorChooser Demo");
   jl=new JLabel("WELCOME TO AlifTutorials");
   jl.setFont(new Font("arial black",Font.ITALIC,25));
   jl.setBackground(Color.green);
   jl.setForeground(Color.blue);
   
   jl.setOpaque(true);
    JPanel jp=new JPanel(new BorderLayout());
    jp.add(jl);
   jp.setBorder(BorderFactory.createTitledBorder("LABEL"));
   
   final JColorChooser jcc=new JColorChooser(jl.getForeground()); 
   ColorSelectionModel jc=jcc.getSelectionModel();
   jc.addChangeListener(new ChangeListener()
     {
     public void stateChanged(ChangeEvent e)
	 {
	  Color newColor=jcc.getColor();
	  jl.setForeground(newColor);
	 }
   });	 
   
   jcc.setBorder(BorderFactory.createTitledBorder(" color Chooser"));
   Container con=getContentPane();
   
   con.add(jp,BorderLayout.NORTH);
   con.add(jcc,BorderLayout.CENTER);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setSize(500,500);
   setVisible(true);
    }
	public static void main(String arg[])
	 {
	  colorchooser cl=new colorchooser();
     }
}	 
