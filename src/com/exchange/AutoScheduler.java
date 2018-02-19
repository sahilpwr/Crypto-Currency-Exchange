package com.exchange;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AutoScheduler extends Schedule {
	
	
	private boolean investmentType;
	private double[] percentageDivision = {0.0,0.0,0.0};
	private double[] growthDivision;
	private boolean roi;
	private double percentROI;
	private double increaseAmountPercentage;
	private boolean divideInvestment;
	private double[] amountDivision;
	private double increaseROIAmount;
	private boolean [] growthFlag = {false, true, false};
	
	public boolean isRoi() {
		return roi;
	}

	public void setRoi(boolean roi) {
		this.roi = roi;
	}

	
	public boolean[] getGrowthFlag() {
		return growthFlag;
	}

	public void setGrowthFlag(boolean[] growthFlag) {
		this.growthFlag = growthFlag;
	}

	public double getIncreaseROIAmount() {
		return increaseROIAmount;
	}

	public void setIncreaseROIAmount(double increaseROIAmount) {
		this.increaseROIAmount = increaseROIAmount;
	}

	public double[] getAmountDivision() {
		return amountDivision;
	}

	public void setAmountDivision(double[] amountDivision) {
		this.amountDivision = amountDivision;
	}

	public boolean isInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(boolean investmentType) {
		this.investmentType = investmentType;
	}

	public double[] getPercentageDivision() {
		return percentageDivision;
	}

	public void setPercentageDivision(double[] percentageDivision) {
		this.percentageDivision = percentageDivision;
	}

	public double[] getGrowthDivision() {
		return growthDivision;
	}

	public void setGrowthDivision(double[] growthDivision) {
		this.growthDivision = growthDivision;
	}

	public double getPercentROI() {
		return percentROI;
	}

	public void setPercentROI(double percentROI) {
		this.percentROI = percentROI;
	}

	public double getIncreaseROI() {
		return increaseAmountPercentage;
	}

	public void setIncreaseROI(double increaseAmountPercentage) {
		this.increaseAmountPercentage = increaseAmountPercentage;
	}

	public boolean isDivideInvestment() {
		return divideInvestment;
	}

	public void setDivideInvestment(boolean divideInvestment) {
		this.divideInvestment = divideInvestment;
	}


	public AutoScheduler() {
		
	}
	
	public AutoScheduler(double amount, boolean investmentType, boolean divideInvestment,
			double [] percentageDivision, double [] growthDivision, double increaseAmountPercentage,
			 double percentROI, int duration, User user, boolean roi)
	{
			
		
		super(amount, duration, user);
		
		this.investmentType = investmentType;
		this.divideInvestment = divideInvestment;
		this.percentageDivision = percentageDivision;
		this.growthDivision = growthDivision;
		this.increaseAmountPercentage = increaseAmountPercentage;
		this.percentROI = percentROI;
		this.roi = roi;
		
		if(roi)
			increaseInvestment();
		
		if(investmentType)
			autoInvest();
		else
			percentInvest();
		
		
	}
	
	
	public boolean autoInvest() {	
		
		double[] actualPercentage = {10,20,30};

		
		// all positive  50-30-20
		if(actualPercentage[0] > 0 && actualPercentage[1] > 0 && actualPercentage[2] > 0) 
		{
			
			if(actualPercentage[0] > actualPercentage[1] && actualPercentage[0] > actualPercentage[2]){
				percentageDivision[0] = 50;
				if(actualPercentage[1] > actualPercentage[2]){
						percentageDivision[1] = 30;
						percentageDivision[2] = 20;
				}
				else
				{
					percentageDivision[2] = 30;
					percentageDivision[1] = 20;
				}
				
			}
			
			
			else if(actualPercentage[1] > actualPercentage[2] && actualPercentage[1] > actualPercentage[0]){
				percentageDivision[1] = 50;
				if(actualPercentage[0] > actualPercentage[2]){
						percentageDivision[0] = 30;
						percentageDivision[2] = 20;
				}
				else
				{
					percentageDivision[2] = 30;
					percentageDivision[0] = 20;
				}
				
			}
			
			else if(actualPercentage[2] > actualPercentage[0] && actualPercentage[2] > actualPercentage[1]){
				percentageDivision[2] = 50;
				if(actualPercentage[0] > actualPercentage[1]){
						percentageDivision[0] = 30;
						percentageDivision[1] = 20;
				}
				else
				{
					percentageDivision[1] = 30;
					percentageDivision[0] = 20;
				}
				
			}	
			
			//33-33-33
			else if(actualPercentage[0] == actualPercentage[1] && actualPercentage[1]== actualPercentage[2] ){
				percentageDivision[0]= 33.3;
				percentageDivision[1] = 33.3;
				percentageDivision[2] =33.3;
				
			}
			
			//50-25-25
			else if(actualPercentage[0] > actualPercentage[1]  && actualPercentage[0] > actualPercentage[2] && actualPercentage[1]== actualPercentage[2]) {
				percentageDivision[0]= 50;
				percentageDivision[1] = 25;
				percentageDivision[2] =25;
			}
			
			else if(actualPercentage[1] > actualPercentage[0]  && actualPercentage[1] > actualPercentage[2] && actualPercentage[0]== actualPercentage[2]) {
				percentageDivision[0]= 25;
				percentageDivision[1] = 50;
				percentageDivision[2] =25;
			}
			
			else if(actualPercentage[2] > actualPercentage[0]  && actualPercentage[2] > actualPercentage[1] && actualPercentage[0]== actualPercentage[1]) {
				percentageDivision[0]= 25;
				percentageDivision[1] = 25;
				percentageDivision[2] =50;
			}
			
			
			
			//40-40-20
			else if(actualPercentage[0] == actualPercentage[1]  && actualPercentage[0] > actualPercentage[2]) {
				percentageDivision[0]= 40;
				percentageDivision[1] = 40;
				percentageDivision[2] =20;
			}
			
			else if(actualPercentage[0] == actualPercentage[2]  && actualPercentage[0] > actualPercentage[1]) {		
				percentageDivision[0]= 40;
				percentageDivision[1] = 20;
				percentageDivision[2] =40;
			}
			
			else if(actualPercentage[1] == actualPercentage[2]  && actualPercentage[1] > actualPercentage[0]) {		
				percentageDivision[0]= 20;
				percentageDivision[1] = 40;
				percentageDivision[2] =40;
			}
			
		}
		//0-0-0
		else if(actualPercentage[0] <= 0 && actualPercentage[1] <= 0 && actualPercentage[2] <= 0) {
			percentageDivision[0]= 0;
			percentageDivision[1] = 0;
			percentageDivision[2] =0;
		}
		
		//100
		else if(actualPercentage[0] > 0 && actualPercentage[1] <= 0 && actualPercentage[2] <= 0) 
		{
			percentageDivision[0]= 100;
		}
		else if(actualPercentage[0] <= 0 && actualPercentage[1] > 0 && actualPercentage[2] <= 0) 
		{
			percentageDivision[1]= 100;
		}
		else if(actualPercentage[0] <= 0 && actualPercentage[1] <= 0 && actualPercentage[2] > 0) 
		{
			percentageDivision[2]= 100;
		}
		
		
		//60-40
		else if(actualPercentage[0] > 0 && actualPercentage[1] > 0 && actualPercentage[2] <= 0) {
			if(actualPercentage[0] > actualPercentage[1]) {
				percentageDivision[0] = 60;
				percentageDivision[1] = 40;
				
			}
			else if(actualPercentage[1] > actualPercentage[0]) {
				percentageDivision[1] = 60;
				percentageDivision[0] = 40;
				
			}
			
			else if(actualPercentage[0] == actualPercentage[1]) {
				percentageDivision[0] = 50;
				percentageDivision[1] = 50;
				
			}
			
		}
		
		else if(actualPercentage[0] > 0 && actualPercentage[1] <= 0 && actualPercentage[2] > 0) {
			if(actualPercentage[0] > actualPercentage[2]) {
				percentageDivision[0] = 60;
				percentageDivision[2] = 40;
				
			}
			else if(actualPercentage[2] > actualPercentage[0]) {
				percentageDivision[2] = 60;
				percentageDivision[0] = 40;
				
			}
			
			else if(actualPercentage[0] == actualPercentage[2]) {
				percentageDivision[0] = 50;
				percentageDivision[2] = 50;
				
			}
			
		}
		else if(actualPercentage[0] <= 0 && actualPercentage[1] > 0 && actualPercentage[2] > 0) {
			if(actualPercentage[1] > actualPercentage[2]) {
				percentageDivision[1] = 60;
				percentageDivision[2] = 40;
				
			}
			else if(actualPercentage[2] > actualPercentage[1]) {
				percentageDivision[2] = 60;
				percentageDivision[1] = 40;
				
			}
			
			else if(actualPercentage[1] == actualPercentage[2]) {
				percentageDivision[1] = 50;
				percentageDivision[2] = 50;
				
			}
			
		}
		
		for(int i=0;i<percentageDivision.length;i++)
		{
			amountDivision[i] = percentageDivision[i] * getAmount() /100;
		}
		
		
	
		return true;
	}
	
	public boolean percentInvest() {
		
		for(int i=0;i<percentageDivision.length;i++)
		{
			amountDivision[i] = percentageDivision[i] * getAmount() /100;
		}
		
		if(!divideInvestment)
		{
			for(int i=0;i<growthFlag.length;i++)
			{
				if(!growthFlag[i])
				{
					amountDivision[i] = 0;
				}
			}
		}
		
	
		return true;
	}
	
	
	public boolean increaseInvestment()
	{
		double temp = getAmount() * increaseAmountPercentage/100 + getAmount();
		
		if(user.getRoi() > percentROI)
		{
			setAmount(temp) ;
		}
		
		
		
		return true;
	}
	
	
	

}
