package com.exchange;

import java.util.Currency;
import java.util.HashMap;

public class CurrencySystem 
{
	private HashMap<String,User> users=new HashMap<>();
	private CryptoCurrency[] currency=new CryptoCurrency[3];
	
	
	public CryptoCurrency[] cryptoInfo()
	{
		return currency;
	}


	public boolean createUser(String userName,String password,String firstName, String lastName ,String emailID)
	{
		
		User newUser=new User();
		newUser.setEmailID(emailID);
		newUser.setPassword(password);
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setUserName(userName);	
		users.put(newUser.getUserName(),newUser);
		
		return true;
	}
	
	public boolean checkUser(String userName,String password)
	{
		if(users.containsKey(userName))
		{
		     User currentUser=users.get(userName);
			 if( currentUser.getPassword().equals(password))
			 {
			   return true;
			 }
	    }
	    return false;
	}

	public void checkSchedule()
	{
		
	}
	
	public static void main(String[] args) 
	{
		

	}

}
