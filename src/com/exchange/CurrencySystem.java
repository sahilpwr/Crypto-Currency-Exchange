package com.exchange;

import java.util.HashMap;

public class CurrencySystem 
{
	private HashMap<String,User> users=new HashMap<>();
	
	
	
	public String cryptoInfo()
	{
		return "";
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
	public boolean checkUser()
	{
		return true;
	}

	public static void main(String[] args) 
	{
		

	}

}
