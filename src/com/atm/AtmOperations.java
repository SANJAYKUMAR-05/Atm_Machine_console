package com.atm;

public interface AtmOperations {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depAmount);
    public void viewMiniStatement();
}
