package com.exchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Random;

public class BankAccount extends Payment 
{
	private HashMap<String, Double> bankAccount;
	private String emailID;

	public BankAccount(String emailID) throws IOException {
		userName = "user";
		password = "user";
		this.emailID = emailID;
		File f = new File(emailID + "Bank.dat");

		if (!f.exists()) {
			bankAccount = new HashMap<String, Double>();
			FileOutputStream fos = new FileOutputStream(emailID + "Bank.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(bankAccount);

		}
	}

	public void setBankAccount(String bankName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(emailID + "Bank.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		bankAccount = (HashMap<String, Double>) ois.readObject();
		Random rand = new Random();
		bankAccount.put(bankName, 50000.00);

		FileOutputStream fos = new FileOutputStream(emailID + "Bank.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(bankAccount);
	}

	public HashMap<String, Double> getBankAccount() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(emailID + "Bank.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		bankAccount = (HashMap<String, Double>) ois.readObject();

		return bankAccount;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
