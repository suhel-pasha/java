package com.xworkz.java_programs.Methods.Example1;
public class PostOffice{
	Letter giveletter(String from_address,String content) {
		Letter L1 = new Letter();
		L1.from_address = from_address;
		L1.content = content;
		System.out.println("Pooja recieved a letter from Pavan. The letter contained the message 'Hello Pooja..!!!'");
		return L1;
	}
		
	
}