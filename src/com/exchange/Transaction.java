package com.exchange;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Transaction implements Serializable {
	

	private double price;
	private double transactionAmount;
	private double currencyQuantity;
	private float transactionFee;
	private String transactionType;
	private String [] bankPayment;
	private String [] cardPayment;
	private Date time;
	private long transactionId;
	private CryptoCurrency[] cryptoCurrency;
	private Payment payment;
	private User user;
	private Wallet[] wallet;
	
	Calendar cal;
	SimpleDateFormat sdf;
	
	PrintWriter output = null; 

	
	
	public Transaction(Wallet[] wallet,CryptoCurrency[] currency,User user) throws FileNotFoundException 
	{
		this.wallet=wallet;
		this.cryptoCurrency=currency;
		this.user=user;
		output = new PrintWriter("transaction.txt");
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public float getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(float transactionFee) {
		this.transactionFee = transactionFee;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String[] getBankPayment() {
		return bankPayment;
	}

	public void setBankPayment(String[] bankPayment) {
		this.bankPayment = bankPayment;
	}

	public String[] getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(String[] cardPayment) {
		this.cardPayment = cardPayment;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public boolean sellCommit(double quantity,double amount,HashMap<String , Double> details,String currency,String bankName)
	{
		double currentBalance=details.get(bankName);

       if(quantity>0)
       {
				
				//amount calculation if quantity given	
				
				if(currency.equalsIgnoreCase("bitcoin")&&wallet[0].getQuantity()>quantity)
				{
					amount=cryptoCurrency[0].getPrice()*quantity;
					currentBalance += amount;
					details.put(bankName, currentBalance);
					wallet[0].subCurrency(quantity);
					
				}
				else if(currency.equalsIgnoreCase("ethereum")&&wallet[0].getQuantity()>quantity)
				{
					amount=cryptoCurrency[1].getPrice()*quantity;
					currentBalance += amount;
					details.put(bankName, currentBalance);
					wallet[1].subCurrency(quantity);
				}
				else if(currency.equalsIgnoreCase("litecoin")&&wallet[0].getQuantity()>quantity)
				{
					amount=cryptoCurrency[2].getPrice()*quantity;
					currentBalance += amount;
					details.put(bankName, currentBalance);
					wallet[2].subCurrency(quantity);
				}
				
				output.print(transactionId);
				output.print(user.getLastTransaction());
				output.println("Buy");
				
				return true;
	  }

	 else if(amount>0)
     {
    	   
    	   //quantity calculation if amount given

	    	       if(currency.equalsIgnoreCase("bitcoin")&&wallet[0].getQuantity()>amount/cryptoCurrency[0].getPrice())
				{
					quantity=amount/cryptoCurrency[0].getPrice();
					currentBalance += amount;
					details.put(bankName, currentBalance);
					wallet[0].subCurrency(quantity);
					
				}
				else if(currency.equalsIgnoreCase("ethereum")&&wallet[1].getQuantity()>amount/cryptoCurrency[1].getPrice())
				{
					quantity=amount/cryptoCurrency[1].getPrice();
					currentBalance += amount;
					details.put(bankName, currentBalance);
					wallet[1].subCurrency(quantity);
				}
				else if(currency.equalsIgnoreCase("ethereum")&&wallet[1].getQuantity()>amount/cryptoCurrency[2].getPrice())
				{
					quantity=amount/cryptoCurrency[2].getPrice();
					currentBalance += amount;
					details.put(bankName, currentBalance);
					wallet[2].subCurrency(quantity);
				}
	    	       
	    	            output.print(transactionId);
					output.print(user.getLastTransaction());
					output.println("Buy");
					
					return true;
    	   		}
    	   		else
    	   		{
    	   			System.out.println("No balance");
				return false;
    	   		}

		
	}

	public boolean buyCurrency(String bankName,double amount, double quantity,
			String currency,Payment payment)
	{
		
		//yet to implement fees and update wallet and transaction!
		double currentBalance=0;
		HashMap<String, Double> details;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		c.add(Calendar.DATE, 7);
		
		if(user.getLastTransaction().before(c)&& user.getLimit() < amount) 
		{
			System.out.println("User has crossed the weekly limit");
		
		    return false;
		}
				
		else if(payment instanceof BankAccount)
		{
			BankAccount ba=(BankAccount)payment;
			details= ba.getBankAccount();
			currentBalance=details.get(bankName);
	       if(quantity>0)
	       {

				if(currentBalance > amount)
				{
					
					//amount calculation if quantity given	
					
					if(currency.equalsIgnoreCase("bitcoin"))
					{
						amount=cryptoCurrency[0].getPrice()*quantity;
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[0].addCurrency(quantity);
						
					}
					else if(currency.equalsIgnoreCase("ethereum"))
					{
						amount=cryptoCurrency[1].getPrice()*quantity;
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[1].addCurrency(quantity);
					}
					else
					{
						amount=cryptoCurrency[2].getPrice()*quantity;
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[2].addCurrency(quantity);
					}
					
					output.print(transactionId);
					output.print(user.getLastTransaction());
					output.println("Buy");
					
					return true;
				}
				else
				{
					System.out.println("No balance");
					return false;
				}
	       }
	       else if(amount>0)
	       {
	    	   
	    	   //quantity calculation if amount given
	    	   		if(currentBalance>amount)
	    	   		{
		    	       if(currency.equalsIgnoreCase("bitcoin"))
					{
						quantity=amount/cryptoCurrency[0].getPrice();
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[0].addCurrency(quantity);
						
					}
					else if(currency.equalsIgnoreCase("ethereum"))
					{
						quantity=amount/cryptoCurrency[1].getPrice();
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[1].addCurrency(quantity);
					}
					else
					{
						quantity=amount/cryptoCurrency[2].getPrice();
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[2].addCurrency(quantity);
					}
		    	       
		    	            output.print(transactionId);
						output.print(user.getLastTransaction());
						output.println("Buy");
						
						return true;
	    	   		}
	    	   		else
	    	   		{
	    	   			System.out.println("No balance");
					return false;
	    	   		}
	       }
			
		}
		else if(payment instanceof CreditCard)
		{
			CreditCard ca=(CreditCard)payment;
			details= ca.getCardAccount();
			currentBalance=details.get(bankName);
	       if(quantity>0)
	       {

				if(currentBalance > amount)
				{
					
					//amount calculation if quantity given	
					
					if(currency.equalsIgnoreCase("bitcoin"))
					{
						amount=cryptoCurrency[0].getPrice()*quantity;
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[0].addCurrency(quantity);
						
					}
					else if(currency.equalsIgnoreCase("ethereum"))
					{
						amount=cryptoCurrency[1].getPrice()*quantity;
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[1].addCurrency(quantity);
					}
					else
					{
						amount=cryptoCurrency[2].getPrice()*quantity;
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[2].addCurrency(quantity);
					}
					
					output.print(transactionId);
					output.print(user.getLastTransaction());
					output.println("Buy");
					
					return true;
				}
				else
				{
					System.out.println("No balance");
					return false;
				}
	       }
	       else if(amount>0)
	       {
	    	   
	    	   //quantity calculation if amount given
	    	   		if(currentBalance>amount)
	    	   		{
		    	       if(currency.equalsIgnoreCase("bitcoin"))
					{
						quantity=amount/cryptoCurrency[0].getPrice();
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[0].addCurrency(quantity);
						
					}
					else if(currency.equalsIgnoreCase("ethereum"))
					{
						quantity=amount/cryptoCurrency[1].getPrice();
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[1].addCurrency(quantity);
					}
					else
					{
						quantity=amount/cryptoCurrency[2].getPrice();
						currentBalance -= amount;
						details.put(bankName, currentBalance);
						wallet[2].addCurrency(quantity);
					}
		    	       
		    	            output.print(transactionId);
						output.print(user.getLastTransaction());
						output.println("Buy");
						
						return true;
	    	   		}
	    	   		else
	    	   		{
	    	   			System.out.println("No balance");
					return false;
	    	   		}
	       }
		
			
		}
		return false;
	 }
	
	public boolean sellCurrency(String bankName,double amount, double quantity,String currency,Payment payment) 
	{

		HashMap<String, Double> details;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		c.add(Calendar.DATE, 7);
		
				
		if(payment instanceof BankAccount)
		{
			BankAccount ba=(BankAccount)payment;
			details= ba.getBankAccount();
			
            return sellCommit(quantity, amount, details, currency, bankName);
		}
	
		else if(payment instanceof CreditCard)
		{
			CreditCard ca=(CreditCard)payment;
			details= ca.getCardAccount();
			
           return  sellCommit(quantity, amount, details, currency, bankName);
			
		}
		return false;
	}
	
	public void transactionHistory () 

	{

		
	}
	
	public void convert(int quantity, String currency1, String currency2)
	{
	
		if(currency1.equalsIgnoreCase("bitcoin")&&currency2.equalsIgnoreCase("ethereum"))
			wallet[1].addCurrency(quantity*cryptoCurrency[0].getPrice()/cryptoCurrency[1].getPrice());
		
		if(currency1.equalsIgnoreCase("bitcoin")&&currency2.equalsIgnoreCase("litecoin"))
			wallet[2].addCurrency(quantity*cryptoCurrency[0].getPrice()/cryptoCurrency[2].getPrice());
		
		if(currency1.equalsIgnoreCase("ethereum")&&currency2.equalsIgnoreCase("bitcoin"))
			wallet[0].addCurrency(quantity*cryptoCurrency[1].getPrice()/cryptoCurrency[0].getPrice());
		
		if(currency1.equalsIgnoreCase("ethereum")&&currency2.equalsIgnoreCase("litecoin"))
			wallet[2].addCurrency(quantity*cryptoCurrency[1].getPrice()/cryptoCurrency[2].getPrice());
		
		if(currency1.equalsIgnoreCase("litecoin")&&currency2.equalsIgnoreCase("bitcoin"))
			wallet[0].addCurrency(quantity*cryptoCurrency[2].getPrice()/cryptoCurrency[0].getPrice());
		
		if(currency1.equalsIgnoreCase("litecoin")&&currency2.equalsIgnoreCase("ethereum"))
			wallet[1].addCurrency(quantity*cryptoCurrency[2].getPrice()/cryptoCurrency[1].getPrice());
		
		
		output.print(transactionId);
		output.print(user.getLastTransaction());
		output.println("Convert");
		
		
		
	}
		
	
}
