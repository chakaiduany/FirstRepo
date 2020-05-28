package com.revature.oop;

public abstract class Animal {
	int age;
	String color;
	double weight;
	
public Animal(int age, String color, double weight) {
		super();
		this.age = age;
		this.color = color;
		this.weight = weight;
	}

public void Eat() {
System.out.println("Eating...");
}

public void sleep() {
	System.out.println("Zzzz...");
}

	

}
