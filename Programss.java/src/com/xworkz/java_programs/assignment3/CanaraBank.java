package com.xworkz.java_programs.assignment3;

import java.util.Scanner;

public class CanaraBank extends ATM {
	public static void main(String[] args) throws wrongPinException, insufficientBalanceException, multipleOf100Exception {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Hello,Insert your card");
			ATMCard cardno1 = new ATMCard();
	        cardno1.name = "SUHEL";
			cardno1.balance = 5000.00;
			cardno1.cardno = 10001;
			cardno1.Pin = 1234;
			
			ATMCard cardno2 = new ATMCard();
	        cardno2.name = "SKANDA";
			cardno2.balance = 10000.00;
			cardno2.cardno = 10002;
			cardno2.Pin = 4321;
			
			int cardno = scanner.nextInt();
			
			if(cardno == cardno1.cardno) {
				pincheck(cardno1);
			}
			else if(cardno == cardno2.cardno) {
				pincheck(cardno2);
			}
			else {
				System.out.println("Invalid card");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
	
	


}
