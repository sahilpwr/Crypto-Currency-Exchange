package com.exchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;

public class User implements Serializable
{
 private String firstName;
 private  String lastName;
 private String  emailID;
 private String password;
 Payment[] payment;
 private int limit;
 private Calendar lastTransaction;
 Wallet[] wallet;
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

public void setEmailID(String emailID) throws IOException
{
	
	this.emailID = emailID;
	
	payment=new Payment[2];
	payment[0]=new BankAccount(emailID);
	payment[1]=new CreditCard(emailID);

	
	File f = new File(emailID+"Wallet.dat");
	
	
	if(!f.exists())
	{     
		wallet=new Wallet[3];
		FileOutputStream fos=new FileOutputStream(emailID+"Wallet.dat");
		ObjectOutputStream  oos=new ObjectOutputStream(fos);
		wallet[0]=new Wallet("bitcoin");
		wallet[1]=new Wallet("ethereum");
		wallet[2]=new Wallet("litecoin");	
		
		oos.writeObject(wallet);
		
	}
		
		
	
	
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

public Wallet[] getWallet() throws IOException, ClassNotFoundException
{
	FileInputStream fis=new FileInputStream(emailID+"Wallet.dat");
	ObjectInputStream ois=new ObjectInputStream(fis);
	wallet=(Wallet[])ois.readObject();
	return wallet;
}

 
User() throws IOException
{
	

}
public void addPayment()
{

}

 public void transaction(String bankName,double amount, double quantity,
			String currencyType,String transactionType,String paymentType) throws ClassNotFoundException, IOException
 { 
	  System.out.println("aaaaa"+paymentType);

	 Transaction transaction=new Transaction(emailID,currency,user);
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
 
 public void conversion(double quantity, String currency1, String currency2,double toQuantity) throws ClassNotFoundException, IOException
 {
	 Transaction transaction=new Transaction(emailID,currency,user);
	 transaction.convert(quantity, currency1, currency2,toQuantity);
	 transactionHistory.put(transactionID, transaction);	
	 transactionID++;
	 

 }
 
 public int getTransactionID() 
 {
		return transactionID;
 }
public Payment getBank() throws IOException, ClassNotFoundException
{
	return payment[0];
}

public Payment getCredit() throws IOException, ClassNotFoundException
{
	return payment[1];
}
 
 public void createAlert(int alertID)
 {
	 Alert alertPrice =new Alert();
     alerts.put(alertID, alertPrice);
     alertID++;
 }
 
 
 public HashMap<Integer,Alert> getAlertHistory()
 {
	 
	 return alerts;
 }
 
 public  HashMap<Integer, Alert> getAlert()
 {
	return alerts;
	 
 }
 
 public void destroyAlert(int id)
 {
	 if(alerts.containsKey(id))
		 alerts.remove(id);
 }
 

}
