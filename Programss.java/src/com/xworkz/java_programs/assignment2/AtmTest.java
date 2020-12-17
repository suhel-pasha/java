package com.xworkz.java_programs.assignment2;

public class AtmTest {
public static void main(String[] args) {
	Atm atm = new Atm();
	
	try {
		atm.check(500, 1000);
	} catch (AtmException e) {
		System.out.println(e);
	}
	
}

@Override
public String toString() {
	return "AtmTest []";
}
}
