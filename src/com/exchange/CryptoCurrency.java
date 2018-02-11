package com.exchange;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CryptoCurrency extends Thread
{
   private double price;
   private Date time;
   private double percentDifference;
   private String currencyName;
   private int multiplier; 
   
   
   public CryptoCurrency(String currencyName, int multiplier) 
   {
	   this.currencyName=currencyName;
	   this.multiplier=multiplier;
   }
   
   public void run()
   {
	   Calendar cal = Calendar.getInstance();
       SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
       System.out.println( sdf.format(cal.getTime()) );
	   while(true)
	   {
		   Random rand = new Random();
		   int  n = rand.nextInt(100) + 1;
		   System.out.println(n+" "+currencyName+" "+sdf.format(cal.getTime()));
		   try 
		   {
			Thread.sleep(200);
		   } 
		   catch (InterruptedException e) 
		   {
			e.printStackTrace();
		   }
	   }
   }
   
}
