package com.exchange;

import java.io.Serializable;

public class Wallet implements Serializable {

	private String currencyName;
	private double quantity;
	private double investment;

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment += investment;
	}

	public double getQuantity() {
		return quantity;
	}

	public Wallet(String currencyName) {
		this.currencyName = currencyName;
		quantity = 0.0;
		investment=0.0;

	}

	public boolean addCurrency(double quantity) {
		this.quantity = this.quantity + quantity;
		return true;
	}

	public boolean subCurrency(double quantity) {
		if (this.quantity >= quantity) {
			this.quantity = this.quantity - quantity;
			return true;
		}
		return false;

	}

}
