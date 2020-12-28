package com.xworkz.java_programs.assignment2;


public class Atm {
int balance;
int withdraw;

public void check(int balance ,int withdarw) throws AtmException {
	this.balance=balance;
	this.withdraw=withdarw;
	if (withdarw>balance) {
		throw new AtmException();
	}
	else {
		System.out.println(withdraw+ " is removed from your account");
	}
}
}

