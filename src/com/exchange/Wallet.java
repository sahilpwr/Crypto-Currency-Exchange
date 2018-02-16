package com.exchange;

import java.io.Serializable;

public class Wallet implements Serializable{

	
	String currencyName;
	double quantity;
	
	public Wallet() {
		
	}
	
	public Wallet(String currencyName) 
	{
		this.currencyName=currencyName;
        quantity=0;

	}

	public boolean addCurrency(double quantity) 
	{
		this.quantity=this.quantity+quantity;
		return true;
	}
	
	public boolean subCurrency(double quantity) {
		if(this.quantity>quantity)
		{
			this.quantity=this.quantity-quantity;
			return true;
		}
		return false;
		
	}
	
	public void convertCurrency() {
		
	}
	
	
}


