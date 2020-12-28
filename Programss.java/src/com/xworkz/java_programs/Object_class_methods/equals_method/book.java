package com.xworkz.java_programs.Object_class_methods.equals_method;

public class book {
	String brand;
	int noOfPages;
	double price;
	public book(String brand, int noOfPages, double price) {
		this.brand = brand;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof book) {
			book bookObj = ((book) obj);
			if(this.brand.equals(bookObj.brand)) {
				if(this.noOfPages == bookObj.noOfPages) {
					if(this.price == bookObj.price) {
						return true;
				}
					else {
						return false;
					}
			}
				else {
					return false;
				}
			
		}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}

