package com.xworkz.java_programs.Abstraction.interface_demo.loose_coupling;

public class loose_cpupling_test {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Epson epson = new Epson();
		Sony sony = new Sony();
		
		computer.slot(sony);
		computer.slot(epson);
	}

}
