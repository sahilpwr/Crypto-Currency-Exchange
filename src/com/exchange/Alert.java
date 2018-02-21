package com.exchange;

public class Alert extends Thread{

	private double alertPrice;
	private String currencyName;
	private boolean notify;
	private int alertId;
	
	public double getAlertPrice() {
		return alertPrice;
	}

	public void setAlertPrice(double alertPrice) {
		this.alertPrice = alertPrice;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public int getAlertId() {
		return alertId;
	}

	public void setAlertId(int alertId) {
		this.alertId = alertId;
	}
	
	
	
	
	
	
}
