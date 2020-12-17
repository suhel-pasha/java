package com.xworkz.java_programs.Operator.instanceoperator;

public class Megha {
	void mouth(Sweet s) {
		if (s instanceof Cake) {
			System.out.println("I got Cake");
		}
		else if (s instanceof Champakali) { 
			System.out.println("I got Champakali");
		}
		else {
			System.out.println("I got Holige");
		}
	}

}
