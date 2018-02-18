package com.exchange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BankAccount extends Payment 
{
	private HashMap<String,Double> bankAccount = new HashMap<>();
	public BankAccount() 
	{
		userName="sahil";	
		password="sahil";
	}
		
	 
	public void setBankAccount(String bankName) 
	{
		Random rand = new Random();
		bankAccount.put(bankName, (double) (rand.nextInt(10000) + 1));
	}
	
	public HashMap<String, Double> getBankAccount() 
	{
		return bankAccount;
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
