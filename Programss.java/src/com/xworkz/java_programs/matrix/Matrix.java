package com.xworkz.java_programs.matrix;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
	int[][] array1 = new int[3][3];
	int[][] array2 = new int[3][3];
	int[][] result = new int[3][3];
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the elements of first matrix");
	
	for(int i=0;i<array1.length;i++) {
		for (int j = 0; j < array1[0].length; j++) {
			array1[i][j] = scan.nextInt();
			
		}
	}
	
System.out.println("Enter the elements of second matrix");
	
	for (int i = 0;i<array2.length;i++) {
		for (int j = 0; j<array2[0].length; j++) {
			array2[i][j] = scan.nextInt();
			
		}
	}
	
	for (int i=0; i<array1.length; i++) {
		for(int j=0; j<array1[0].length; j++) {
			result[i][j] = array1[i][j]+array2[i][j];
		}
	}
System.out.println("The resultant matrix is");
	
	for (int i = 0; i < result.length; i++) {
		for (int j = 0; j < result[0].length; j++) {
			System.out.print(result[i][j] + " ");
			
		}
		System.out.println();
	}
	scan.close();
	
	

}
}
