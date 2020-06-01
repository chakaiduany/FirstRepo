package com.practice;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(int wheels, String motor) {
		super(wheels, motor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Runs very Fast!");
	}

}
