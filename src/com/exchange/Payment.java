package com.exchange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

public class Payment implements Serializable {

	protected double transactionFee;
	protected String bankName;
	protected String userName;
	protected String password;

	public void setBankAccount(String bankName) throws FileNotFoundException, IOException, ClassNotFoundException {

	}

	public void setcreditCardAccount(String cardName)
			throws FileNotFoundException, IOException, ClassNotFoundException {

	}

	public HashMap<String, Double> getBankAccount() throws FileNotFoundException, IOException, ClassNotFoundException {
		return null;
	}

	public Payment() {
		transactionFee = 10.0;
	}

	public HashMap<String, Double> getCardAccount() throws IOException, ClassNotFoundException {

		return null;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
