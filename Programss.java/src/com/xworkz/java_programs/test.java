package com.xworkz.java_programs;

import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: "); 
 
    int rows = scan.nextInt();
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print("*" + " ");
    }
    System.out.println();
    }
    scan.close();
    }
    }
