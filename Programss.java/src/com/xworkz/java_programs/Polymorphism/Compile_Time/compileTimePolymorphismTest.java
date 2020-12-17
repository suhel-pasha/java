package com.xworkz.java_programs.Polymorphism.Compile_Time;

class compileTimePolymorphismTest{
    public static void main(String args[]){
    short i=10;
    short j=5;
    multiply(i,j);
    }
    static void multiply(int i,int j){
    System.out.println("calling method which takes int");
    System.out.println("i*j=" + (i*j));
    }
    static void multiply(long i,long j){
    System.out.println("calling method which takes long");
    System.out.println("i*j:"+ (i*j));
    }
}
