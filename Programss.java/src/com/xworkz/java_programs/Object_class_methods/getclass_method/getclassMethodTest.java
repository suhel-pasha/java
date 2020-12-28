package com.xworkz.java_programs.Object_class_methods.getclass_method;

public class getclassMethodTest {

	public static void main(String[] args) {
		Bulb bulb = new Bulb();
		String b = bulb.getClass().getSimpleName();
		System.out.println(b);
		

	}

}
