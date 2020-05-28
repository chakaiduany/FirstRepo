package com.practice;

public abstract class Vehicle {
	int wheels;
	String motor;
	
	public abstract void drive();

	public Vehicle(int wheels, String motor) {
		super();
		this.wheels = wheels;
		this.motor = motor;
	}
	
	
	
	
}
