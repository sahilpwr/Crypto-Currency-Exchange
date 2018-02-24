package com.exchange.gui;

import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

import com.exchange.AutoScheduler;
import com.exchange.User;

public class RepeatAuto extends TimerTask  {
	
	AutoScheduler value;
	User currentUser;
	public RepeatAuto(AutoScheduler value,User currentUser)
	{
		this.value=value;
		this.currentUser=currentUser;
	}
	public void run()
	{
		
		 				
				try 
				{   
					if(value.getROI());
					{
						value.increaseInvestment();
					}
					if(value.getInvestmentType()) {
						value.autoInvest();
					}
					else {
						value.percentInvest();	
					}
					
					value.quantityDivision();
					
				currentUser.transaction(value.getBankname(), value.getAmount1(), value.getQuantity1(), 
						"bitcoin", "buy", value.getPaymentType());
				currentUser.transaction(value.getBankname(), value.getAmount2(), value.getQuantity2(), 
						"ethereum", "buy", value.getPaymentType());
				currentUser.transaction(value.getBankname(), value.getAmount3(), value.getQuantity3(), 
						"litecoin", "buy", value.getPaymentType());
				Date date = new Date();
				System.out.println(date);
				
			} 
				catch (ClassNotFoundException e) 
				{
				e.printStackTrace();
			} 
				catch (IOException e)
				{
			
				e.printStackTrace();
			}
			
		
		
		
	}

}
