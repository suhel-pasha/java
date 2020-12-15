package com.xworkz.java_programs.Operator.instanceoperator;

public class InstanceofOperatorDemo {

	public static void main(String[] args) {
		Cake cake = new Cake();
		Champakali champakali = new Champakali();
		Holige holige = new Holige();
		Megha megha = new Megha();
		megha.mouth(champakali);
		megha.mouth(holige);
		megha.mouth(cake);


	}

}
