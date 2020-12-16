package com.xworkz.java_programs.aptitude.Patterns.AlphaNumerics;
/*
 *      S
 *    S U H
 *  S U H E L
 *    S U H
 *      S
 */

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
        String s=scan.nextLine();
		int mid = s.length()/2;
		int uprang1 = mid-1;
		int uprang2 = mid+1;
		int downrang1 = 0;
		int downrang2 = s.length()-1;
		
		
		for (int i = 0; i < s.length()+1; i++) {
			if(i<mid+1) {
				int pos = 0;

		    
			for (int j = 0; j < s.length(); j++) {
				if(j>uprang1 && j<uprang2) {
				System.out.print(s.charAt(pos)+" ");
				pos++;
				}
				else
				System.out.print("  ");

				
			}
			System.out.println();
			uprang1--;
			uprang2++;
			
		}
		else{
			int pos=0;
			for (int j = 0; j < s.length(); j++) {
				if(j>downrang1 && j<downrang2) {
				System.out.print(s.charAt(pos)+" ");
				pos++;
				}
				else
				System.out.print("  ");

				
			}
			System.out.println();
			downrang1++;
			downrang2--;

		}
		}
        scan.close();
	    }
	}

	

