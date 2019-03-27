/*
AudioClip interface
The AudioClip interface is a simple abstraction for playing a sound clip. Multiple AudioClip items can be playing at the same time, and the resulting sound is mixed together to produce a composite.
*/
import java.awt.*;
import java.applet.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class AudioTest extends JApplet implements ActionListener
{
  private JComboBox jcb;
  private JButton play,stop,loop;
  private JLabel jl,jl2;
  private AudioClip aclip;
  private String file;

  private String files[]={"spacemusic","computer","chirp1","gong"};

  public void init()
   {
    jcb=new JComboBox();

        for(int i=0;i<files.length;i++)
        {
   jcb.addItem((Object)files[i]+".au");
        }
       play=new JButton("Play");
       loop=new JButton("Loop");
       stop=new JButton("Stop");

   play.addActionListener(this);
        loop.addActionListener(this);
        stop.addActionListener(this);

       jl=new JLabel("Play List");
       jl2=new JLabel("Music file");

 JPanel jp=new JPanel(new GridLayout(2,3));
    jp.add(jl);jp.add(jcb);jp.add(jl2);
jp.add(play);jp.add(loop);jp.add(stop);

  getContentPane().add(jp,"North");
     }

  public void actionPerformed(ActionEvent ae)
      {
 file=jcb.getSelectedItem().toString();
 aclip=getAudioClip(getDocumentBase(),file);
          jl2.setText(file);
  JButton jb=(JButton)ae.getSource();
         if(jb==play)
           aclip.play();
         else if(jb==stop)
           aclip.stop();
          else
            aclip.loop();
        }
 }
