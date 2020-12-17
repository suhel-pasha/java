package com.xworkz.java_programs.aptitude.patterns.AlphaNumerics;
import java.util.Scanner;

/*
 *     A
 *   A B A
 * A B C B A
 *   A B A
 *     A
 * */

public class pattern4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int NoOfLines = scanner.nextInt();//7
		int mid = NoOfLines/2;//4
		int val = (NoOfLines-5)/2;
	int x = 65;
	for (int i = 0; i < NoOfLines; i++) {
		if(i<mid+1) {
		for (int j = mid-i; j >0 ; j--) {
			System.out.print("  ");
			
		}
		for (int j = 65; j <=x+i; j++) {
			System.out.print((char)j+" ");
			
		}
		for (int j =x+i-1; j>=65; j--) {
			System.out.print((char)j+" ");
			
		}
		
		
	}
		else {
			for (int j = 0; j <i-mid; j++) {
				System.out.print("  ");
			}
			for (int j = 65; j <x+NoOfLines-i; j++) {
				System.out.print((char)j+" ");
				
			}
			for (int j = 65+val; j>=x ; j--) {
				System.out.print((char)j+" ");
				
			}
			
			val--;
		}
		System.out.println();
		
	}
	scanner.close();
	}
	
}


