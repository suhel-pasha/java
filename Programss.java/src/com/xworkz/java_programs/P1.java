package com.xworkz.java_programs;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		long num = scan.nextLong();
		
		String s="a";
		while(s!="") {
			
		
		long count=0;
		long i;
		for(i=2; i<num/2; i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Yes ");
			}
		else {
			System.out.println("no "+i);
			
		}
		System.out.println("Enter a new number or return key to exit");
		s = scan.nextLine();
		

	}
	scan.close();
	}

}
