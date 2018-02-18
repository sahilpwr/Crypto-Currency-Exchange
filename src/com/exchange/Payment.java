package com.exchange;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

public class Payment implements Serializable 
{

	protected double transactionFee;
	protected String bankName;
	protected String userName;
	protected String password;


	public void setBankAccount(String bankName) 
	{
		
	}
	
	public Payment()
	{
		transactionFee = 10.0;
	}
	

	public String getBankName() 
	{
		return bankName;
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
