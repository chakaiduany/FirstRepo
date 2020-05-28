package com.revature.oop;

public class Human {
	
	String name;
	int age;
	String hairColor;
	String superPower;
	
	// Humans are born using the constructor template
	
	public Human() {
		
	}
	
	public Human(String name, int age, String hairColor, String superPower) {
		super();
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
		this.superPower = superPower;
	}


	public void speak() {
		System.out.println("Hi my name is " + this.name);

}
	
	public void eat() {
		System.out.println("Eating...");
		
}
	
	public void work() {
		System.out.println("Working...");
		
		
	}
}