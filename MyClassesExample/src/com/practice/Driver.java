package com.practice;

public class Driver {

	public static void main(String[] args) {

		System.out.println("I'm in the main method!");
		
		Car porsche = new Car(4, "quiet", true, "Bose Stereo");
		porsche.drive();
		
		Motorcycle Suzuki = new Motorcycle(2, "Loud");
	}

}
