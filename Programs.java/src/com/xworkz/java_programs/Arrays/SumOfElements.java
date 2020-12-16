package com.xworkz.java_programs.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {1,2,3,6,7,4,6,2,4,6,8,9,2,4,5};
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println("The sum of the elements in the array is "+sum);
    }
    
}
