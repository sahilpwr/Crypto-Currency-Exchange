package com.exchange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BankAccount extends Payment {

	 public HashMap<String, Double> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(HashMap<String, Double> bankAccount) {
		this.bankAccount = bankAccount;
	}

	private HashMap<String,Double> bankAccount = new HashMap<>();
	
	
	
	public BankAccount() {
		
		Random rand = new Random();
		 
		bankAccount.put("BOFA", (double) (rand.nextInt(10000) + 1));
		bankAccount.put("Chase", (double) (rand.nextInt(10000) + 1));
		bankAccount.put("Wells Fargo", (double) (rand.nextInt(10000) + 1));
		bankAccount.put("Citi", (double) (rand.nextInt(10000) + 1));
		bankAccount.put("HSBC", (double) (rand.nextInt(10000) + 1));
	}
}
