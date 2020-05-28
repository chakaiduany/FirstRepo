package com.practice;

public class Car extends Vehicle {
	
	boolean sunroof;
	String stereoBrand;
	

	// overriding is an example of Polymorphism
	@Override
	public void drive() {
		System.out.println("Drives like a Dream!");
		
	}

	// overloading is an example of Polymorphism
	public void drive(int miles) {
		System.out.println("The car just drove " + miles + " miles.");
	}

	public Car(int wheels, String motor, boolean sunroof, String stereoBrand) {
		super(wheels, motor); // This is an example of inheritance!
		this.sunroof = sunroof;
		this.stereoBrand = stereoBrand;
		
		
		
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	

