package com.exchange;

public class Alert extends Thread{

	private double alertPrice;
	private String currencyName;
	private CryptoCurrency cryptoCurrencies ;
	private CryptoCurrency[] currency;
	private boolean notify;
	private int alertId;
	
	public boolean isNotify() 
	{
		return notify;
	}
	
	public Alert(int id) 
	{
		
		this.alertId = id;
	}
	
	


	public void run()
	{
		while(true)
		{
			if(alertPrice>=cryptoCurrencies.getPrice())
				notify=true;
			else
				notify=false;
				
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public void createAlert(CurrencySystem system,String currencyName, double price) {
		
		this.alertPrice = price;
		this.currencyName = currencyName;
		currency=system.cryptoInfo()	;	
		
		if(currencyName.equalsIgnoreCase("bitcoin"))
			this.cryptoCurrencies = currency[0];
		
		if(currencyName.equalsIgnoreCase("ethereum"))
			this.cryptoCurrencies = currency[1];
		
		if(currencyName.equalsIgnoreCase("litecoin"))
			this.cryptoCurrencies = currency[2];
		
	}
	
}
