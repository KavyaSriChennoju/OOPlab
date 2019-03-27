import java.io.*;
import java.text.*;
import java.util.*;

public class CurrencyDemo
 {
   public static void main(String args[])  
    {
      Currency cur=Currency.getInstance(Locale.getDefault());

//Currency cur=Currency.getInstance(Locale.JAPAN );
       System.out.println("Currency code.."+cur.getCurrencyCode());
       System.out.println("Fraction Digits.."+cur.getDefaultFractionDigits());
      System.out.println("Symbol.."+cur.getSymbol());
   }
}