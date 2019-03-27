import java.io.*;
import java.util.*;
import java.text.*;


public class NumberFormatDemo
{
  public static void main(String args[])
   {
      double number=5634.5665;

	  NumberFormat nfd=NumberFormat.getInstance();
	  System.out.println("Number is.."+nfd.format(number));
	  
	  NumberFormat currency=NumberFormat.getCurrencyInstance();
	  System.out.println("Currency is.."+currency.format(number));
	  
	  NumberFormat percent=NumberFormat.getPercentInstance();
	  System.out.println("Percentage is.."+percent.format(number));
	  
	  //locales
NumberFormat nfcoun=NumberFormat.getCurrencyInstance(Locale.UK);
	  System.out.println("currency in germany..."+nfcoun.format(number));
	  
	  
	  NumberFormat ncoun=NumberFormat.getInstance(Locale.GERMAN);
	  System.out.println("Number in GERMANY.."+ncoun.format(number));
   }
}   
   
   
