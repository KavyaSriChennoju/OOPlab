import java.io.*;
public class SpaceDemo 
{
 public static void main(String[] args) 
 {
	File fdrive=new File("f:\\");
	//Since: jdk 1.6 
	long fspace=fdrive.getFreeSpace();
	long tspace=fdrive.getTotalSpace();
	long uspace=tspace-fspace;
	
	System.out.println("Total space..."+tspace);
	System.out.println("Free space...."+fspace);
	System.out.println("Used space...."+uspace);
  }
}
