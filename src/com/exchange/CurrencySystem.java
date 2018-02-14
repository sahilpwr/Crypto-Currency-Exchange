package com.exchange;
import com.exchange.gui.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencySystem 
{
	private  HashMap<String,User> users=new HashMap<>();
	private static CryptoCurrency[] currency=new CryptoCurrency[3];
	
	
	
	public static CryptoCurrency[] cryptoInfo()
	{
		System.out.println(currency[0].getPrice());
		return currency;
	}


	public  boolean createUser(String password,String firstName, String lastName ,String emailID)
	{
		//Pattern p = Pattern.compile("^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$");
		//Matcher m = p.matcher(emailID);
		if (!users.containsKey(emailID))
		{
			User newUser=new User();
			newUser.setEmailID(emailID);
			newUser.setPassword(password);
			newUser.setFirstName(firstName);
			newUser.setLastName(lastName);
			users.put(newUser.getEmailID(),newUser);
			
			return true;
		}
		return false;
	}
	
	public  User checkUser(String emailID,String password)
	{
		if(users.containsKey(emailID))
		{
		     User currentUser=users.get(emailID);
			 if( currentUser.getPassword().equals(password))
			 {
			   return currentUser;
			 }
	    }
	   return null;
	}

	public static void checkSchedule()
	{
	
	}
	
	public static void main(String[] args) 
	{
		currency[0]=new CryptoCurrency("bitcoin",15000);
		currency[0].start();
		currency[1]=new CryptoCurrency("ethereum",8000);
		currency[1].start();
		currency[2]=new CryptoCurrency("litecoin",1000);
		currency[2].start();

		CurrencySystem system=new CurrencySystem();
		String button = null;
		
		
		/*if(button.equals("payment"))
		{
			
		}
		else if(button.equals("transaction"))
		{
			
		}
		else if(button.equals("convert"))
		{
			
		}
		else if(button.equals("schedule"))
		{
			
		}
		else if(button.equals("autoSchedule"))
		{
			
		}
		else if(button.equals("alerts"))
		{
			
		}*/
		HomeGUI g=new HomeGUI(system);
		g.setVisible(true);
		
	}

}
