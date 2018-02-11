package com.exchange;

public class User 
{
 private String firstName;
 private  String lastName;
 private String  emailID;
 private String password;
 private String[] bankPayment;
 private String[] creditPayemt;
 private  String userName;
 
 
 public  String getUserName() 
 {
	return userName;
 }

public void setUserName(String userName) 
{
	this.userName = userName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getRoi() {
	return roi;
}

public void setRoi(double roi) {
	this.roi = roi;
}



private double roi;
 
 public void setUser()
 {
	 
 }
 

}
