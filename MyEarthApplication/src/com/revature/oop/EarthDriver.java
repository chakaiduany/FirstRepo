package com.revature.oop;

public class EarthDriver {

	public static void main(String[] args) {
		
		// System.out.println("There's nobody here!");
		
		Human person1 = new Human();
		// person1.eat();
		
		person1.name = "Cassie";
		person1.age = 11;
		person1.hairColor = "Purple";
		person1.superPower = "Dancing and Drawing!";
		
		Human person2 = new Human();
		
		person2.name = "Brooke";
		person2.age = 10;
		person2.hairColor = "Pink";
		person2.superPower = "SuperSmart!";
		
		Human person3 = new Human("Neville", 6, "Green", "Flying");
		
		person1.speak();
		person2.speak();
		person3.speak();
		
		
		// System.out.println(person1);
		// System.out.println(person2);
		
		// System.out.println(person1.hashCode());
		
		// Animal thing1 = new Animal(3, "grey", 23.5);
		// thing1.Eat();
		
		Bird bird1 = new Bird(1, "blue", 26);
		bird1.Eat();
		
		Bird pigeon = new Bird(2, "greyish-blue", 5);
		pigeon.sleep();
		
		FlyingMammal bat = new FlyingMammal(45, "black", 28);
		bat.fly();
		
		Bird parrot = new Bird(7, "red", 4);
		parrot.Eat();
		
		
	}
	
}
		
