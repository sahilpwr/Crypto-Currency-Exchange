package com.exchange;
import com.exchange.gui.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencySystem implements Serializable
{
	private  HashMap<String,User> users=new HashMap<>();
	private CryptoCurrency[] currency=new CryptoCurrency[3];
	
	public CurrencySystem()
	{
		
		File f = new File("Users.srt");
		if(f.exists()) { 
		    // do something
		}
		
		currency[0]=new CryptoCurrency("bitcoin",15000);
		currency[0].start();
		currency[1]=new CryptoCurrency("ethereum",8000);
		currency[1].start();
		currency[2]=new CryptoCurrency("litecoin",1000);
		currency[2].start();
	}
	
	public CryptoCurrency[] cryptoInfo()
	{
		System.out.println(currency[0].getPrice());
		return currency;
	}


	public  boolean createUser(String password,String firstName, String lastName ,String emailID) throws IOException
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
			
			FileOutputStream fos=new FileOutputStream("Users.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();
            fos.close();
			return true;
		}
		return false;
	}
	
	public  User checkUser(String emailID,String password) throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("Users.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		HashMap<String, User> users=(HashMap<String, User>)ois.readObject();
		
		
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
