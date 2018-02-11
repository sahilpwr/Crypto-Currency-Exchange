package com.exchange;


public class Payment {

	protected double transactionFee;
	protected String bankName;
	private String userName;
	private String password;
	
	public boolean validatePayment() {
		
		return true;
	}

	public boolean validateCredentials() {
		
		return true;
		
	}
	
}
