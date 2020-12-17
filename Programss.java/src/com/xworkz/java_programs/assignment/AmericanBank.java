package com.xworkz.java_programs.assignment;

public class AmericanBank implements ATMCard {
    // balance should not be accessible to everyone 
  private double balance;

  // instance block
  {
    // Opening account with 2000
    this.balance = 2000;
  }

  // method to perform deposit operation 
  public void deposit(double amount)
              throws InvalidAmountException {

    if( amount <= 0) {
      throw new InvalidAmountException(
               "Invalid amount; amount<=0");
    }
    balance = balance + amount;

  }

  // method to perform withdraw operation  
  public double withdraw(double amount)
         throws InvalidAmountException,
               InsufficientFundsException {

    if( amount <= 0) {
      throw new InvalidAmountException(
               "Invalid amount; amount<=0");
    }
    if( balance < amount) {
      throw new InsufficientFundsException(amount +
                " not available in your account");
    }
    balance = balance - amount;
    return amount;
  }

  // method to perform balanceEnquiry operation 
  public double balanceEnquiry(){
    return balance;
  }

}

