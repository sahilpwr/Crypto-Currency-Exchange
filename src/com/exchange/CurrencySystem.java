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
	private  HashMap<String,User> 	users;//=new HashMap<String,User>();
	private CryptoCurrency[] currency=new CryptoCurrency[3];
/*	private FileOutputStream fos=new FileOutputStream("Users.dat");
	private ObjectOutputStream  oos=new ObjectOutputStream(fos);
	private FileInputStream fis=new FileInputStream("Users.dat");
	private ObjectInputStream ois=new ObjectInputStream(fis);*/

	
   
	
	public CurrencySystem() throws IOException
	{
		User newUser;
		File f = new File("Users.dat");
		if(!f.exists())
		{     
			users=new HashMap<String,User>();
			FileOutputStream fos=new FileOutputStream("Users.dat");
			@SuppressWarnings("resource")
			ObjectOutputStream  oos=new ObjectOutputStream(fos);
			newUser=new User();
			users.put("none", newUser);
			oos.writeObject(users);
			
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
		//System.out.println(currency[0].getPrice());
		return currency;
	}


	@SuppressWarnings("unchecked")
	public  boolean createUser(String password,String firstName, String lastName ,String emailID) throws IOException, ClassNotFoundException
	{
		
		// users=(HashMap<String, User>)ois.readObject();
		FileInputStream fis=new FileInputStream("Users.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    users=(HashMap<String, User>)ois.readObject();
		
		System.out.println(users.containsKey(emailID));
		if (!users.containsKey(emailID))
		{
			User newUser=new User();
			newUser.setEmailID(emailID);
			newUser.setPassword(password);
			newUser.setFirstName(firstName);
			newUser.setLastName(lastName);
			users.put(newUser.getEmailID(),newUser);
			
			FileOutputStream fos=new FileOutputStream("Users.dat");
			ObjectOutputStream  oos=new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.close();
            fos.close();
            
            
           // users=(HashMap<String, User>)ois.readObject();
			return true;
		}
		else
			System.out.println("exist");
		return false;
	}
	
	public  User checkUser(String emailID,String password) throws IOException, ClassNotFoundException
	{
		
		FileInputStream fis=new FileInputStream("Users.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    users=(HashMap<String, User>)ois.readObject();
		
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
	
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		CurrencySystem system=new CurrencySystem();
		String button = null;
		
	    HomeGUI g=new HomeGUI(system);
	    g.setVisible(true);
	    Thread t=new Thread(g);
	    t.start();
	   
	}

}
