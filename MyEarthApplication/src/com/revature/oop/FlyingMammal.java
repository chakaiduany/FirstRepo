package com.revature.oop;

public class FlyingMammal extends Animal implements Flyable {

	public FlyingMammal(int age, String color, double weight) {
		super(age, color, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Glides through the clouds swiftly");
		
	}

}
