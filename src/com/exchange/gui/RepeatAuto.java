package com.exchange.gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
		Date date=new Date();
		System.out.println("Original investment" + value.getAmount());
				value.setOriginalAmount(value.getAmount());
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
				
				value.setAmount(value.getOriginalAmount());
				
				currentUser.transaction(value.getBankname(), value.getAmount1(), value.getQuantity1(), 
									"bitcoin", "buy", value.getPaymentType());
				currentUser.transaction(value.getBankname(), value.getAmount2(), value.getQuantity2(), 
									"ethereum", "buy", value.getPaymentType());
				currentUser.transaction(value.getBankname(), value.getAmount3(), value.getQuantity3(), 
									"litecoin", "buy", value.getPaymentType());
				
				
				String data1="bitcoin "+value.getQuantity1()+" "+value.getAmount1()+" "+value.getBankname()+" "+"Buy";
				String data2="ethereum "+value.getQuantity2()+" "+value.getAmount2()+" "+value.getBankname()+" "+"Buy";
				String data3="litecoin "+value.getQuantity3()+" "+value.getAmount3()+" "+value.getBankname()+" "+"Buy";
				
				try (FileWriter fw = new FileWriter(currentUser.getEmailID() + "TransactionLog.txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out = new PrintWriter(bw)) {
					out.println(data1);
					out.println(data2);
					out.println(data3);
					

				} catch (IOException e) {

				}
			
			
		System.out.println("Transaction for Auto Schduler executed at: " +date);
		
		
	}

}
