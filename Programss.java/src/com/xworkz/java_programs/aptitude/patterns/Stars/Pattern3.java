package com.xworkz.java_programs.aptitude.Patterns.Stars;
/*     *
 *   * *
 * * * *
 *   * *
 *     *
 */

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = scan.nextInt();
		int mid=(row/2) +1;
		int row2=row-mid;
		for(int i=0;i<mid;i++ ) {
			for(int j=0;j<mid;j++) {
				if(i==mid-1 || j==mid-1 || i+j>=mid-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=0;i<row2;i++) {
			for(int j=0;j<row2+1;j++) {
				if(j==0 || i==row2 || i==j || i>j) {
					System.out.print("  ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
    scan.close();
	}

}
