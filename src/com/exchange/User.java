package com.exchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class User implements Serializable {

	private String firstName;
	private String lastName;
	private String emailID;
	private String password;
	private Payment[] payment;
	private Wallet[] wallet;
	private CryptoCurrency[] currency;
	private HashMap<String, Alert> alerts = new HashMap<>();
	private int transactionID ;
	private HashMap<Integer, ManualScheduler> schedulerHistory;
	private int schedulerID;
	private int autoSchedulerID;
	private HashMap<Integer, AutoScheduler> autoSchedulerHistory;
	private ArrayList<Transaction> transactionHistory;


	
	public void setEmailID(String emailID) throws IOException {
		schedulerID = 1;
		autoSchedulerID = 1;
		transactionID=1;

		this.emailID = emailID;
		schedulerHistory = new HashMap<Integer, ManualScheduler>();
		autoSchedulerHistory = new HashMap<Integer, AutoScheduler>();
		transactionHistory = new ArrayList<Transaction>();
		alerts = new HashMap<>();
		payment = new Payment[2];
		payment[0] = new BankAccount(emailID);
		payment[1] = new CreditCard(emailID);

		File f = new File(emailID + "Wallet.dat");

		if (!f.exists()) {
			wallet = new Wallet[3];
			FileOutputStream fos = new FileOutputStream(emailID + "Wallet.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			wallet[0] = new Wallet("bitcoin");
			wallet[1] = new Wallet("ethereum");
			wallet[2] = new Wallet("litecoin");

			oos.writeObject(wallet);

		}

		File f1 = new File(emailID + "Transaction.dat");

		if (!f1.exists()) {

			FileOutputStream fos = new FileOutputStream(emailID + "Transaction.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(transactionHistory);

		}

	}
	
	


	User() throws IOException {

	}

	
	public boolean transaction(String bankName, double amount, double quantity, String currencyType,
			String transactionType, String paymentType) throws ClassNotFoundException, IOException {

		boolean commit = false;
		Transaction transaction = new Transaction(emailID, currency, transactionType, paymentType, transactionID);
		transactionID++;
		
		if (transactionType == "buy" && paymentType == "bank")
			commit=transaction.buyCurrency(bankName, amount, quantity, currencyType, payment[0]);
		else if (transactionType == "buy" && paymentType == "credit")
			commit=transaction.buyCurrency(bankName, amount, quantity, currencyType, payment[1]);
		if (transactionType == "sell" && paymentType == "bank")
			commit=transaction.sellCurrency(bankName, amount, quantity, currencyType, payment[0]);
		else if (transactionType == "sell" && paymentType == "credit")
			commit=transaction.sellCurrency(bankName, amount, quantity, currencyType, payment[1]);

		FileInputStream fis = new FileInputStream(emailID + "Transaction.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		transactionHistory = (ArrayList<Transaction>) ois.readObject();

		transactionHistory.add(transaction);

		FileOutputStream fos = new FileOutputStream(emailID + "Transaction.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(transactionHistory);
		
		if(commit)
		    System.out.println("Transaction Executed");
		
		return commit;

	}

	public void conversion(double quantity, String currency1, String currency2, double toQuantity)
			throws ClassNotFoundException, IOException
	{
		Transaction transaction = new Transaction(emailID, currency);
		transaction.convert(quantity, currency1, currency2, toQuantity);

	}


	public void setSchedulerHistory(User user, double amount, double quantity, int duration, boolean type, String name,
			CurrencySystem system, CryptoCurrency[] currency, String bankName, Date date) {
		ManualScheduler manual = new ManualScheduler(user, amount, quantity, duration, type, name, system, currency,
				bankName, date);
		schedulerHistory.put(schedulerID++, manual);

	}



	public void setAutoSchedulerHistory(double amount, boolean investmentType, boolean divideInvestment,
			double[] percentageDivision, double[] growthDivision, double increaseAmountPercentage, double percentROI,
			int duration, User user, boolean roi, String name, Date date, CurrencySystem currencySystem,
			CryptoCurrency[] cryptoCurrencies) 
	{
		AutoScheduler auto = new AutoScheduler(amount, investmentType, divideInvestment, percentageDivision,
				growthDivision, increaseAmountPercentage, percentROI, duration, user, roi, name, date, currencySystem,
				cryptoCurrencies);
	
		autoSchedulerHistory.put(autoSchedulerID++, auto);
	}

	public ArrayList<Transaction> getTransactionHistory() throws IOException, ClassNotFoundException 
	{

		FileInputStream fis = new FileInputStream(emailID + "Transaction.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		transactionHistory = (ArrayList<Transaction>) ois.readObject();

		return transactionHistory;
	}
	
	public int getTransactionID() {

		return transactionID;
	}

	public Payment getBank() throws IOException, ClassNotFoundException {
		return payment[0];
	}

	public Payment getCredit() throws IOException, ClassNotFoundException {
		return payment[1];
	}

	public void createAlert(String alertID) 
	{
		Alert alertPrice = new Alert();
		alerts.put(alertID, alertPrice);

	}

	public HashMap<String, Alert> getAlertHistory() 
	{

		return alerts;
	}

	public void destroyAlert(String id) 
	{
		if (alerts.containsKey(id))
			alerts.remove(id);
	}

	public HashMap<Integer, ManualScheduler> getSchedulerHistory() 
	{
		return schedulerHistory;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	public HashMap<Integer, AutoScheduler> getAutoSchedulerHistory() 
	{
		return autoSchedulerHistory;
	}
	
	public Wallet[] getWallet() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(emailID + "Wallet.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		wallet = (Wallet[]) ois.readObject();
		return wallet;
	}


}
