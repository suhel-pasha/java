package com.xworkz.java_programs.Constructor.Constructor_overloading;

public class Cat {
	String name;
	String gender;
	int age;
	
	Cat(){
		System.out.println("Cat created using default constructor");
		
	}
	
	Cat(String catName){
		name = catName;
		System.out.println("Cat created using parameterised constructor");
	}
	
	Cat(String catName,String catGender,int catAge){
		name = catName;
		gender = catGender;
		age = catAge;
		System.out.println("Cat created using 3 parameterised constructor");
		
	}

}
