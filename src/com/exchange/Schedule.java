package com.exchange;

import java.util.Date;

public class Schedule {
	
	private Payment[] payment;
	private Date createDateTime;
	private Integer duration;
	private double amount;
	private CryptoCurrency[] c;
	private CurrencySystem currencySystem;
	private User user;
	
	
	public CurrencySystem getCurrencySystem() {
		return currencySystem;
	}


	public void setCurrencySystem(CurrencySystem currencySystem) {
		this.currencySystem = currencySystem;
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Payment[] getPayment() {
		return payment;
	}


	public void setPayment(Payment[] payment) {
		this.payment = payment;
	}


	public Date getCreateDateTime() {
		return createDateTime;
	}


	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public CryptoCurrency[] getC() {
		return c;
	}


	public void setC(CryptoCurrency[] c) {
		this.c = c;
	}


	
	public boolean crateSchedule(Payment p, Date date, double duration2, CryptoCurrency[] c2, double amount2, double quantity) {
		return false;
	}
	
	
	public Schedule()
	{
	
	}
	
	public Schedule(double amount, int duration, User user)
	{
		this.amount = amount;
		this.duration = duration;
		this.user = user;
	}
	
}

