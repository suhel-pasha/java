package com.xworkz.java_programs.assignment;

public interface ATMCard {
    // abstract methods

  public void deposit(double amount)
  throws InvalidAmountException;

public double withdraw(double amount)
throws InvalidAmountException,
     InsufficientFundsException;

public double balanceEnquiry();

}

