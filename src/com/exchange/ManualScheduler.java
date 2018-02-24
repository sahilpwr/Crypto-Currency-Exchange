package com.exchange;

import java.util.Date;

public class ManualScheduler extends Schedule {
	private double quantity;
	private boolean investmentType;
	private String currencyName;
	CurrencySystem system;
	CryptoCurrency [] currency;
	private String bankName;
	private Date createDate;
	private String paymentType;
	
	
	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ManualScheduler() {
	
	}
	
	public ManualScheduler(User user, double amount, double quantity, int duration, boolean type,
			String name,	CurrencySystem system,	CryptoCurrency []currency, String bankName, Date date)
	{
		super(amount, duration, user);
		this.quantity = quantity;
		this.investmentType = type;
		this.currencyName = name;
		this.currency=currency;
		this.system=system;
		this.bankName = bankName;
		this.createDate = date;
  	  	if(bankName.contains("card"))
		  paymentType="credit";
  	  		else 
		  paymentType="bank";

		
		if(!this.investmentType)
			scheduleByQuantity();
		else
			scheduleByAmount();
	}
	   
	
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public Date ExecuteDate() {
		Date execDate = new Date();
		Date currentDate = new Date();
		execDate.setSeconds(getCreateDate().getSeconds() + getDuration());
		while(execDate.before(currentDate)) {
			execDate.setSeconds(execDate.getSeconds() + getDuration());
		}
		System.out.println("Current Date:" + currentDate);
		System.out.println("Execute Date:" + execDate);
		return execDate;
		
	}

	public boolean scheduleByQuantity()
	{
		
		System.out.println("HITTED");
		
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
	
	public boolean scheduleByAmount()
	{
		
		System.out.println("HITTED");
		
		double temp= 0;
		
		currency = system.cryptoInfo();
		
		if(currencyName.equalsIgnoreCase("bitcoin"))
			temp = currency[0].getPrice();
		else if(currencyName.equalsIgnoreCase("ethereum"))
			temp = currency[1].getPrice();
		else if(currencyName.equalsIgnoreCase("litecoin"))
			temp = currency[2].getPrice();
		
		setQuantity(getAmount()/temp);
		
		return true;
	}


	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
		
	public boolean crateSchedule(Payment p, java.util.Date date, double dur, CryptoCurrency c,	
			double amount, double quant ) {
		return false;
	}

}
