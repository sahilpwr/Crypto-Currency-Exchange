package com.exchange;

import java.util.HashMap;
import java.util.Random;

public class CreditCard extends Payment {

	 private HashMap<String,Double> cardType = new HashMap<>();

	public HashMap<String, Double> getCardType() {
		return cardType;
	}

	public void setCardType(HashMap<String, Double> cardType) {
		this.cardType = cardType;
		
	}
	
	
	public CreditCard() {
		
		Random rand = new Random();
		 
		cardType.put("BOFA", (double) (rand.nextInt(10000) + 1));
		cardType.put("Chase", (double) (rand.nextInt(10000) + 1));
		cardType.put("Wells Fargo", (double) (rand.nextInt(10000) + 1));
		cardType.put("Citi", (double) (rand.nextInt(10000) + 1));
		cardType.put("Discover", (double) (rand.nextInt(10000) + 1));
		
		
		
	}
	
}
