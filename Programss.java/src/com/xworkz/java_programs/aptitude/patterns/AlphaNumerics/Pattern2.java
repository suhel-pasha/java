package com.xworkz.java_programs.aptitude.Patterns.AlphaNumerics;

import java.util.Scanner;

/**
 *        1
 *      2 1
 *    3 2 1
 *  4 3 2 1
 *    3 2 1
 *      2 1
 *        1
 * 
 */

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int noOfLines = scan.nextInt();
        int mid = (noOfLines/2)+1;//4
        int space=mid-1;//3
        int nums=1;
        int space2=1;
        int nums2=mid-1;//3
        for (int i = 0; i < noOfLines; i++) {
            if(i<mid) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
                
            }
            for (int j = nums; j <= nums; j--) {
                System.out.print(j+" ");
                if(j==1)
                break;
            }
            System.out.println();
            space--;
            nums++;
        }
        else {
            for (int j = 0; j < space2; j++) {
                System.out.print("  ");
                
            }
            for (int j = nums2; j <= nums2; j--) {
                System.out.print(j+" ");
                if (j == 1)
                    break;
            }
            System.out.println();
            space2++;
            nums2--;
        }

        }
        scan.close();
        }
    }
