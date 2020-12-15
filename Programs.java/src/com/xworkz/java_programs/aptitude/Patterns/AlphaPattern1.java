package com.xworkz.java_programs.aptitude.Patterns;

public class AlphaPattern1 {

	public static void main(String[] args) {
		String s="SUHEL";
		 for (int i = 0; i <= 4; i++)
	        {
	            int a = 0;
	            for (int j = 4; j >= i; j--)
	            {
	                System.out.print(" ");
	            }

	            for (int k = 0; k <= i; k++)
	            {
	                System.out.print(s.charAt((a+k)) + " ");
	                
	            }
	            System.out.println();
	        }
	        for (int i = 0; i <= 4; i++)
	        {
	            int a= 0;
	            for (int j = -1; j <= i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= 3 - i; k++)
	            {
	                System.out.print(s.charAt(a + k) + " ");
	                
	            }
	            System.out.println();
	        }
	    }
	}

	
