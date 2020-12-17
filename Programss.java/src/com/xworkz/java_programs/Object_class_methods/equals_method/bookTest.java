package com.xworkz.java_programs.Object_class_methods.equals_method;

public class bookTest {

	public static void main(String[] args) {
		
		book book1 = new book("Classmate",100,40.00);
		book book2 = new book("Classmate",100,40.00);
		boolean isEqual = book1.equals(book2);
		System.out.println(isEqual);

	}

}
