package com.xworkz.java_programs.matrix;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] Matrix1 = new int[100][100];
		int[][] Matrix2 = new int[100][100];
		int[][] Resultant = new int[100][100];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows of first matrix");
		int row1 = scan.nextInt();
		
		System.out.println("Enter the number of columns of first matrix");
		int column1 = scan.nextInt();
		
		System.out.println("Enter the number of rows of second matrix");
		int row2 = scan.nextInt();
		
		System.out.println("Enter the number of columns of second matrix");
		int column2 = scan.nextInt();
		
		System.out.println("Enter the elements of the first matrix");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				Matrix1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter the elements of the second matrix");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<column2;j++) {
				Matrix2[i][j]=scan.nextInt();
			}
		}
		
		if(column1==row2) {
			
			for(int i=0;i<row1;i++) {
			    for(int j=0;j<column2;j++) {
			    	Resultant[i][j] = 0;
			    	for(int k =0;k<row1;k++) {
			    	
					Resultant[i][j]=Resultant[i][j]+Matrix1[i][k]*Matrix2[k][j];
				}
			    
			    
			}
			}
			for(int i=0;i<row1;i++) {
				for(int j=0;j<column2;j++) {
					System.out.print(Resultant[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("The matrices can not be multiplied");
		
		scan.close();
	}

}
