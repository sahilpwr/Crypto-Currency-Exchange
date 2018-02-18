package com.exchange;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class User implements Serializable
{
 private String firstName;
 private  String lastName;
 private String  emailID;
 private String password;
 Payment[] payment=new Payment[2];
 private int limit;
 private Calendar lastTransaction;
 Wallet[] wallet=new Wallet[3];
 CryptoCurrency[] currency;
 User user;
 HashMap<Integer, Alert> alerts=new HashMap<>();
int alertID=1;
int transactionID=1;
private double roi;
HashMap<Integer, Transaction> transactionHistory=new HashMap();

 
 public int getLimit() {
	return limit;
}

public void setLimit(int limit) {
	this.limit = limit;
}

public Calendar getLastTransaction() {
	return lastTransaction;
}

public void setLastTransaction(Calendar lastTransaction) {
	this.lastTransaction = lastTransaction;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getRoi() {
	return roi;
}

public void setRoi(double roi) {
	this.roi = roi;
}



 
User()
{
	wallet[0]=new Wallet("bitcoin");
	wallet[1]=new Wallet("ethereum");
	wallet[2]=new Wallet("litecoin");
	
	payment[0]=new BankAccount();
	payment[1]=new CreditCard();
}
public void addPayment()
{

}

 public void transaction(String bankName,double amount, double quantity,
			String currencyType,String transactionType,String paymentType) throws FileNotFoundException
 { 
	 Transaction transaction=new Transaction(wallet,currency,user);
	 if(transactionType=="buy"&&paymentType=="bank")
	    transaction.buyCurrency(bankName, amount, quantity, currencyType,payment[0]);
	 else if(transactionType=="buy"&&paymentType=="credit")
		 transaction.buyCurrency(bankName, amount, quantity, currencyType,payment[1]);
	 if(transactionType=="sell"&&paymentType=="bank")
		  transaction.sellCurrency(bankName, amount, quantity, currencyType,payment[0]);
     else if(transactionType=="sell"&&paymentType=="credit")
	      transaction.sellCurrency(bankName, amount, quantity, currencyType,payment[1]);
	 
	 transactionHistory.put(transactionID, transaction);	
	 transactionID++;
 }
 
 public int getTransactionID() 
 {
		return transactionID;
 }

 
 public void createAlert(CurrencySystem system,String currencyName,double price)
 {
	 Alert alertPrice =new Alert(alertID);
	 alertPrice.createAlert(system, currencyName, price);
	 alertPrice.start();
     alerts.put(alertID, alertPrice);
     alertID++;
 }
 
 public void destroyAlert(int id)
 {
	 if(alerts.containsKey(id))
		 alerts.remove(id);
 }
 

}
