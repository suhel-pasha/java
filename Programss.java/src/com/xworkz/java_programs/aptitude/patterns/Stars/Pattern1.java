package com.xworkz.java_programs.aptitude.patterns.Stars;
/* 
 * *
 * * *
 * * * *
 * * * * *
 */
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = scan.nextInt();
		for(int i=0;i<row;i++ ) {
			for(int j=0;j<row;j++) {
				if(j==0 || i==row-1 || i==j || i>j) {
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
