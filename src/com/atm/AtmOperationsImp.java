package com.atm;
import java.util.*;
import java.util.Map;

public class AtmOperationsImp implements AtmOperations{
	
	Map<Double,String> mpp = new HashMap<>();
	ATM atm = new ATM();
	@Override
	public void viewBalance() {
		System.out.println("Avaliable Balance : "+atm.getAmount());
	}
	
	@Override
	public void withdrawAmount(double withdrawAmt) {
		// TODO Auto-generated method stub
		double currAmount = atm.getAmount();
		 if(withdrawAmt <= 0)
		 {
		        System.out.println("Please enter a valid amount.");
		 }
		else if(withdrawAmt <= currAmount)
		{
			mpp.put(withdrawAmt,"Amount Withdrawn");
			atm.setAmount(currAmount - withdrawAmt);
			System.out.println(withdrawAmt + " Withdraw Successfully !!");
			viewBalance();
		}
		else 
		{
			System.out.println("Insufficient Balance !!");
			viewBalance();
		}
	}

	@Override
	public void depositAmount(double depAmount) {
		// TODO Auto-generated method stub
		mpp.put(depAmount,"Amount Deposited");
		System.out.println(depAmount + " deposited Successfully !!");
		atm.setAmount(atm.getAmount() + depAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m : mpp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
