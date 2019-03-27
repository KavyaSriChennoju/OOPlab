import java.io.*;
import java.lang.*;
import java.util.zip.*;


public class ZipStreamTest
{
static int  Ration(long size,long packed)
   {
     float f=(float)packed/size*100;
     int r=100-Math.round(f);
     return r;
   }

public static void main(String args[])throws IOException
  {
  FileInputStream fis=new FileInputStream("f:\\validator.zip");
  ZipInputStream zis=new ZipInputStream(fis);
  ZipEntry zip;
  System.out.println("File Size...\tCompressed Size\tRatio\t\tFile Name..");
   while( (zip=zis.getNextEntry())!=null )
   {
	long s=zip.getSize();
	 long p=zip.getCompressedSize();
	int rt=Ration(s,p);
System.out.println(zip.getSize()+"\t\t"+zip.getCompressedSize()+"\t"+rt+"%\t\t\t"+zip.getName());
    }
  }
}