package com.practice;

public class Tractor extends Vehicle{
	
	public Tractor(int wheels, String motor) {
		super(wheels, motor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Transpots Freight!");
	}
	
	

}
