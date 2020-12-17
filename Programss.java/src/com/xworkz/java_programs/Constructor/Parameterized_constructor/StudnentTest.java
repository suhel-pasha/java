package com.xworkz.java_programs.Constructor.Parameterized_constructor;

public class StudnentTest {

	public static void main(String[] args) {
		Student S = new Student("Skanda",101);
		Student P = new Student("Sam",99);
		
		System.out.println("Name of Student: "+S.name);
		System.out.println("ID of Student: "+S.id);
		
		System.out.println("Name of Student: "+P.name);
		System.out.println("ID of Student: "+P.id);
		

	}

}
