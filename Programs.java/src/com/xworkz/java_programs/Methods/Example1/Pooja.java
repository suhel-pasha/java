package com.xworkz.java_programs.Methods.Example1;
public class Pooja{
	public static void main(String[] args) {
		System.out.println("Pooja reached the Post Office. ");
		PostOffice P = new PostOffice();
		Letter L1 = P.giveletter("Pavan", "Hello Pooja");
		L1.open();
		
	}
}