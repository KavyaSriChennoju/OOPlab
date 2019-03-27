import java.io.*;
import java.text.*;
import java.util.*;


public class DefaultLocale
{
 public static void main(String args[])
  {
    Locale.setDefault(Locale.GERMANY);
    Locale loc=Locale.getDefault();
	System.out.println("Country info..."+loc.getCountry());
	System.out.println("Country info..."+loc.getDisplayCountry());
	System.out.println("Language.."+loc.getLanguage());
	System.out.println("Language..."+loc.getDisplayLanguage());
	System.out.println("Name is..."+loc.getDisplayName());
  }
}  
  
  