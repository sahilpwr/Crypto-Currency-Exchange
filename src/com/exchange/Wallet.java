package com.exchange;

import java.io.Serializable;

public class Wallet implements Serializable{

	
	private String currencyName;
	private double quantity;
	
	
	public double getQuantity() {
		return quantity;
	}

	public Wallet(String currencyName) 
	{
		this.currencyName=currencyName;
        quantity=0.0;

	}
	
	public boolean addCurrency(double quantity) 
	{
		this.quantity=this.quantity+quantity;
		return true;
	}
	
	public boolean subCurrency(double quantity) {
		if(this.quantity>=quantity)
		{
			this.quantity=this.quantity-quantity;
			return true;
		}
		return false;
		
	}

	
}


