package com.exchange;

import java.util.Date;

public class Transaction {

	private long transactionId;
	private double price;
	private double transactionAmount;
	private double currencyQuantity;
	private float transactionFee;
	private String transactionType;
	private String [] bankPayment;
	private String [] cardPayment;
	private Date time;
	
	
	
	public boolean buyCurrency() {
		
		return true;
	}
	
	public boolean sellCurrency() {
		
		return true;
	}
	
	public void transactionHistory () {
		
	}
	
	public boolean addPayment() {
		
		return true;
	}
	
	
	
	
	
}
