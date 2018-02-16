package com.exchange;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CryptoCurrency extends Thread implements Serializable
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
		   int  price = rand.nextInt(multiplier) + 1;
		   //System.out.println(n+" "+currencyName+" "+sdf.format(cal.getTime()));
		   
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

public double getPrice() {
	return price;
}


public Date getTime() {
	return time;
}

public double getPercentDifference() {
	return percentDifference;
}

public void setPercentDifference(double percentDifference) {
	this.percentDifference = percentDifference;
}

public String getCurrencyName() {
	return currencyName;
}

   
   
}
