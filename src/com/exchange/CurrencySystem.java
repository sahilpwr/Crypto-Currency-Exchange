package com.exchange;

import java.util.HashMap;

public class CurrencySystem 
{
	private HashMap<String,User> users=new HashMap<>();
	private String userName;
	private String password;
	private String firstName;
	private  String lastName;
	private String  emailID;
	
	
	public String cryptoInfo()
	{
		return "";
	}
	
	

	

	public boolean createUser(String username,String password,String firstName, String lastname ,String emailID)
	{
		
		
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	
		User newUser=new User();
		
		
		users.put(newUser., value);
		
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
