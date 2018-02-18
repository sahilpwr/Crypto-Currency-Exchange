package com.exchange;

import java.util.HashMap;
import java.util.Random;

public class CreditCard extends Payment {

	 private HashMap<String,Double> cardAccount = new HashMap<>();

	public CreditCard()
	{
		
	}
	public void setcreditCardAccount(String cardName)
	{
		Random rand = new Random();
		cardAccount.put(cardName, (double) (rand.nextInt(10000) + 1));
	}

	
	public String getUserName()
	{
		return userName;
	}

	public String getPassword() 
	{
		return password;
	}

	
}
