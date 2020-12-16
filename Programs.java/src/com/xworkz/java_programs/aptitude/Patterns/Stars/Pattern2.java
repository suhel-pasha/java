package com.javatraining.Patterns.Stars;
/*
 * * 
 * * *
 * *
 * 
 */
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = scan.nextInt();
		int mid=(row/2) +1;
		int row2=row-mid;
		for(int i=0;i<mid;i++ ) {
			for(int j=0;j<mid;j++) {
				if(j==0 || i==mid-1 || i==j || i>j) {
					System.out.print("* ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<row2;i++) {
			for(int j=0;j<row2;j++) {
				if(i==0 || j==0 || j+i<row2) {
					System.out.print("* ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


    scan.close();
	}

}
