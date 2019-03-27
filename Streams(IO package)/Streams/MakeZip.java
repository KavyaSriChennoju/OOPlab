import java.io.*;
import java.lang.*;
import java.util.zip.*;

public class MakeZip
{
 public static void main(String args[])throws IOException
 {
   FileOutputStream fos=new FileOutputStream("test5.zip");
   ZipOutputStream zos=new ZipOutputStream(fos);

   File f=new File("e:/html");
   File files[]=f.listFiles();

   ZipEntry zip; 

   for(int i=0;i<files.length;i++)
    {
     zip=new ZipEntry(files[i].getName());
     zos.putNextEntry(zip);
     zos.closeEntry();
    }
    System.out.println("File is Zipped");
    zos.close();
  }
}


