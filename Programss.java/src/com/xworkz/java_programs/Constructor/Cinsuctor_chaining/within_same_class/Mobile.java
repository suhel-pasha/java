package com.xworkz.java_programs.Constructor.Cinsuctor_chaining.within_same_class;

public class Mobile {
	String brand;
	double Price;
	
	Mobile(){
		System.out.println("default constructor");
	}
	Mobile(String mobileBrand){
		this();
		System.out.println("a parameterised constructor");
	}
	Mobile(String brand,double price){
		this(brand);
		System.out.println("a parameterised constructor");
		this.brand = brand;
		this.Price = price;
		
	}
	

}
