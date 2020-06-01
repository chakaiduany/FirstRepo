package collections3;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		/*
		 * HashSets & LinkedSets --> implement the Set Interface
		 * --Sets differ from Lists because they don't allow duplicates
		 */
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(2);
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		Animal a1 = new Animal("Dog", 7);
		Animal a2 = new Animal("Cat", 12);
		Animal a3 = new Animal("Fish", 2);
		Animal a4 = new Animal ("Dog", 7);
		
		HashSet<Animal> set = new HashSet<Animal>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		
		for (Animal animal : set) {
			System.out.println(animal);
		}
			
			System.out.println("Content Comparison: " + a1.equals(a4));
			System.out.println("Memory Comparison: " + (a1 == a4));
			System.out.println(a1.hashCode() + " " + a4.hashCode());

			
			Animal cat = new Animal("Cat", 10);
			int futureAge = cat.futureAge();
			
			System.out.println("The cat's age in 20 years is: " + futureAge);
			
			Animal parrot = new Animal("Parrot", 32);
			parrot.shoutName();
			
			Animal d = new Animal("Dolphin", 10);
			d.shoutName();
			d.choppedName();
			
			String newName = d.anotherNameMethod();
			System.out.println(newName);
	
			

		}
	}
		
	
		
		
		



