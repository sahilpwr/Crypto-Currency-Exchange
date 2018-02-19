package com.exchange;

import java.sql.Date;

public class ManualScheduler extends Schedule {
	private double quantity;
	private boolean investmentType;
	private String currencyName;
	CurrencySystem system;
	CryptoCurrency [] currency;
	
	
	public ManualScheduler() {
	
	}
	
	public ManualScheduler(User user, double amount, double quantity, int duration, boolean type,
			String name,	CurrencySystem system,	CryptoCurrency []currency)
	{
		super(amount, duration, user);
		this.quantity = quantity;
		this.investmentType = type;
		this.currencyName = name;
		this.currency=currency;
		this.system=system;
		
		if(!this.investmentType)
			scheduleByQuantity();
	}
	
	
	
	public boolean scheduleByQuantity()
	{
		
		double temp= 0;
		
		currency = system.cryptoInfo();
		
		if(currencyName.equalsIgnoreCase("bitcoin"))
			temp = currency[0].getPrice();
		else if(currencyName.equalsIgnoreCase("ethereum"))
			temp = currency[1].getPrice();
		else if(currencyName.equalsIgnoreCase("litecoin"))
			temp = currency[2].getPrice();
		
		setAmount(temp*quantity);
		
		return true;
	}

	
	
	
	
	
	public boolean crateSchedule(Payment p, java.util.Date date, double dur, CryptoCurrency c,	
			double amount, double quant ) {
		return false;
	}

}
