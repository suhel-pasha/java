package com.xworkz.java_programs.assignment;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args)
    throws InstantiationException,
                         IllegalAccessException {

   // declare variables 
   // To avoid NullPointerException
   // initialize them with their default value
   String bankName = null, nextOption = null;
   int option = 0;
   double amount = 0.0, withdrawalAmount = 0.0;
 
   // create Scanner class object
   Scanner scan = new Scanner(System.in);

   // Outer while loop wil keep ATM machine 
   // always in the active mode
   // Program will remain always active
   while(true){

     // read input
     System.out.print("Enter ATMCard (BankName): ");
     bankName = scan.next();

     try {
       // reading class dynamically at runtime
       ATMCard card = (ATMCard)Class.forName(bankName).getDeclaredConstructor().newInstance();

       start: //label
       while(true) { //inner-while loop
         System.out.println("\n*****Choose operation*****");
         System.out.println(" 1. Deposit");
         System.out.println(" 2. Withdraw");
         System.out.println(" 3. Balance Enquiry");
         System.out.println(" 4. Exit");
         option = scan.nextInt();

         try {
           switch(option){

             // deposit operation
             case 1:
             {
               System.out.print("Enter amount to deposit: ");
               amount = scan.nextDouble();
               card.deposit(amount);
               System.out.println("Amount "+ amount + 
                                       " deposited");
               break;
             }

             // withdraw operation 
             case 2:
             {
               System.out.print("Enter amount to withdraw: ");
               amount = scan.nextDouble();
               withdrawalAmount = card.withdraw(amount);
               System.out.println("Collect "+ 
                               withdrawalAmount+" cash");
               break;
             }

             // balance-enquiry operation 
             case 3:
             {
               System.out.println("Current Balance: "+
                              card.balanceEnquiry());
               break;
             }

             // exit operation 
             case 4:
               break start;

             default:
               System.out.println("Invalid option");
           } //switch close

           // Ask for next operation
           System.out.println("\nDo you want to continue? ");
           System.out.print("Enter Y or N: ");
           nextOption = scan.next();
           if("N".equalsIgnoreCase(nextOption)) 
               break start;
         } // inner-try close

         catch (InvalidAmountException e) {
           System.out.println(e.getMessage());
         } catch (InsufficientFundsException e) {
           System.out.println(e.getMessage());
         } catch (Exception e) {
           System.out.println(e.getMessage());
         } // inner-catch close
       } //inner-while close

     } // outer-try close
     catch(ClassNotFoundException e) {
       System.out.println("Bank is not available.");
     } catch (Exception e) {
       System.out.println(e.getMessage());
     } // outer-catch close 

     System.out.println("\n*********************************");
     System.out.println("    Thank You :) Visit again");
     System.out.println("***********************************\n");
     scan.close();

 } // outer-while close
  } // main-method close
} //class close
    

