package com.exchange;

public class ManualScheduler extends Schedule {
	private double quantity;
	
	public ManualScheduler() 
	{
		super();
	}
	public ManualScheduler(Payment payment, int dur, CryptoCurrency currency,	
			double amount, double quantity) 
	{
		super();
		this.payment[0] = payment;
		this.duration = dur;
		this.c[0] = currency;
		this.amount = amount;
		this.quantity = quantity;
	}
	

}
