package com.xworkz.java_programs.Object_class_methods.tostring_method;

public class Charger {
	String brand;
	double price;
	String color;
	
	public Charger(String brand,double price,String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	

}
