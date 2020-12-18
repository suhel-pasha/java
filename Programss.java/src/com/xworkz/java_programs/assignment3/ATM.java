package com.xworkz.java_programs.assignment3;

import java.util.Scanner;

public class ATM {
	static Scanner scanner = new Scanner(System.in);
	 

	static void pincheck(ATMCard a) throws wrongPinException, insufficientBalanceException, multipleOf100Exception{
		System.out.println("Enter the pin");
		int p = scanner.nextInt();
		if(p!=a.Pin) {
			throw new wrongPinException("Invalid pin");
		
		}
		else {
			options(a);
		}
	}

	 static void options(ATMCard a) throws insufficientBalanceException, multipleOf100Exception {
		System.out.println("Selsect an Option");
		System.out.println("1)Balance Enquiry");
		System.out.println("2)Withdraw");
		System.out.println("3)Exit");
		int i = scanner.nextInt();
		switch (i) {
		case 1: {
			balance(a);
			break;
		}
			
		case 2: {
			withdraw(a);
			break;
		}
		case 3: {
			exit(a);
			break;
		}

		default:
			System.out.println("invalid option");
			break;
		}
	}

	 static void exit(ATMCard a) {
		System.out.println("Thank you for using canara bank!!");
		
	}

	 static void withdraw(ATMCard a) throws insufficientBalanceException,multipleOf100Exception{
		System.out.println("Enter the amount to be debited");
		int j = scanner.nextInt();
		if(j>a.balance) {
			throw new insufficientBalanceException("Insufficient Balance");
		}
		else if(j%100!=0) {
			throw new multipleOf100Exception("Please enter the amount in multiple of 100s");
		}
		else {
		System.out.println("Rs."+j+" were debited successfully from yoyr account");
		System.out.println("your current balance is "+(a.balance-j));
		}
		
	}

	 static void balance(ATMCard a) {
		System.out.println("Your current balance is "+a.balance);
	scanner.close();	
	}
	
}
