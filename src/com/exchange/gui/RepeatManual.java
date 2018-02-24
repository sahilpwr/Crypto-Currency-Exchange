package com.exchange.gui;

import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

import com.exchange.ManualScheduler;
import com.exchange.User;

public class RepeatManual extends TimerTask 
{
	ManualScheduler value;
	User currentUser;
	
	public RepeatManual(ManualScheduler value,User currentUser)
	{
		this.value=value;
		this.currentUser=currentUser;
	}

	@Override
	public void run() 
	{
		Date date=new Date();
		try 
		{
			currentUser.transaction(value.getBankName(), value.getAmount(), value.getQuantity(), 
					value.getCurrencyName(), "buy", value.getPaymentType());
		} 
	    catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
	     {
			e.printStackTrace();
		}
		
		System.out.println("Transaction for Manual Schduler executed at: " +date);
		
	}

}
