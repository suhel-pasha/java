package com.xworkz.java_programs.arrays;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        
    int[] numbers = {1,2,3,4,5,6,5,3,6,3,2,7};
    int count = 0;
    System.out.println("Enter the number whose frequency is to be calculated:");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    for (int i = 0; i < numbers.length; i++) {
        if(num == numbers[i])
        count++;
    }
    System.out.println("The frequency of "+num+" in the array is "+count);
    scan.close();
    }
}

