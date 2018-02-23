package com.exchange;

public class Alert extends Thread{

	private double alertPrice;
	private String currencyName;
	private String notify;
	private String alertID;
	public String getAlertID() {
		return alertID;
	}

	public void setAlertID(String alertID) {
		this.alertID = alertID;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}
	
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


	
	
	
	
	
}
