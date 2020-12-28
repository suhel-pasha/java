package com.xworkz.java_programs.arrays.matrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns");
		int col = scan.nextInt();
		int[][] OriginalMatrix = new int[10][10];
		int[][] TransposedMatrix = new int[10][10];
		System.out.println("Enter the elements into the matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				OriginalMatrix[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				TransposedMatrix[j][i]=OriginalMatrix[i][j];

				
			}
		}
		System.out.println("The transposed matrix is ");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(TransposedMatrix[i][j] + " ");
				
			}
			System.out.println();
		}
		scan.close();
	}
	

}
