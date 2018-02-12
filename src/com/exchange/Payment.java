package com.exchange;

import java.util.HashMap;
import java.util.Random;

public class Payment {

	protected double transactionFee;
	public double getTransactionFee() {
		return transactionFee;
	}


	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	protected String bankName;
	private String userName;
	private String password;

	
	public Payment()
	{
		transactionFee = 10.0;
	}
	
	
	public boolean validatePayment() {
		
		return true;
	}

	public boolean validateCredentials() {
		
		return true;
		
	}
	
}
