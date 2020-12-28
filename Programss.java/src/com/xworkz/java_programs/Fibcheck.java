package com.xworkz.java_programs;

import java.util.Scanner;

public class Fibcheck {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		scan.close();
		int fib1=0,fib2=1,fibn=0,count=0;
		for (; n >= fibn;) {
			if(n==fibn)
			{
				count++;
			   break;
			}
			else
			{
				fibn=fib1+fib2;
			    fib1=fib2;
			    fib2=fibn;
			}	
		}
		if(count==1)
			System.out.println(n+" is a fib");
		else
			System.out.println(n+" is not a fib");
			
			
		}
		

	}


