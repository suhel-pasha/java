package com.xworkz.java_programs.arrays;

public class ElementsInEvenPos {
    public static void main(String[] args) {
        int[] numbers = {1,5,5,4,4,7,8,9,6,3,1,2,4,7,5,6};
        for (int i = 0; i < numbers.length; i++) {
            if(i%2 != 0)
            System.out.print(numbers[i]+" ");
        }
    }
    
}
