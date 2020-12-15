package com.xworkz.java_programs.Object_class_methods.clonemethod.Deep_copy;

public class DeepcopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Xworkz xworkz = new Xworkz();
		xworkz.name =  "Xworkz";
		xworkz.founder = "Omkar";
		xworkz.location ="Rajajinagar";
		xworkz.asha.name = "Asha";
		xworkz.asha.DOB = "29-12-1992";
		Xworkz duplicatexworkz = xworkz.clone();
		
		duplicatexworkz.asha.DOB = "29-09-1993";
		duplicatexworkz.founder = "Prajwal";
		System.out.println(xworkz);
		System.out.println(duplicatexworkz);
		

	}

}
