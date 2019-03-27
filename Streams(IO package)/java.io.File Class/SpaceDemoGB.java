import java.io.*;
import java.text.NumberFormat;
public class SpaceDemoGB
{
 public static void main(String[] args) 
 {
	File fdrive=new File("f:\\");
	//Since: jdk 1.6 
	long fspace=fdrive.getFreeSpace();
	long tspace=fdrive.getTotalSpace();
	long uspace=tspace-fspace;
	
	 NumberFormat nfd=NumberFormat.getInstance();
	  nfd.setMaximumFractionDigits(2);

	  String totalbytes=nfd.format(tspace);
	  String usedbytes=nfd.format(uspace);
	  String freebytes=nfd.format(fspace);
	  
	  double totalgb=byteToGB(tspace);
	  double freegb=byteToGB(fspace);
	  double usedgb=byteToGB(uspace);
	  
	System.out.println("Total space..."+totalbytes+" bytes\t"+nfd.format(totalgb)+" GB");
	System.out.println("Free space...."+freebytes+" bytes\t"+nfd.format(freegb)+" GB");
	System.out.println("Used space...."+usedbytes+" bytes\t"+nfd.format(usedgb)+" GB");
  }
 public static double byteToGB(double bytes)
 {
	 double kb=bytes/1024;
	 double mb=kb/1024;
	 double gb=mb/1024;
	 //double number=99.54672241210938 ;
	 return gb;
 }
}
