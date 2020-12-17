package com.xworkz.java_programs.Object_class_methods.clonemethod.Deep_copy;

public class Xworkz implements Cloneable {
	String name;
	String founder;
	String location;
	Asha asha = new Asha();
	
	public Xworkz clone() throws CloneNotSupportedException {
		Xworkz xworkz = (Xworkz)super.clone();
		xworkz.asha = new Asha();
		return xworkz;
	}

	@Override
	public String toString() {
		return "Xworkz [name=" + name + ", founder=" + founder + ", location=" + location + ", asha=" + asha + "]";
	}
	

}

