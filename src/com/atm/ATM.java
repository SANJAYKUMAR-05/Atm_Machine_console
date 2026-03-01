package com.atm;

public class ATM {
  private double amount;
  private double depositAmount;
  private double WithdrawAmount;
  public ATM()
  {
	  
  }
  public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
}
public double getWithdrawAmount() {
	return WithdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount) {
	WithdrawAmount = withdrawAmount;
}
  
}
