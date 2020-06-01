package collections;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList words = new ArrayList();
		words.add("tiger");
		words.add("elephant");
		words.add("bear");
		
		words.add(32);
		words.add(42);
		
		System.out.println(words);
		
		System.out.println("The second element is: " + words.get(1));
		
		int e = (int) words.get(3);
		System.out.println("Our int is: " + e);
		
		ArrayList<Integer> myIntegers = new ArrayList<Integer>();
		myIntegers.add(23);
		myIntegers.add(34);
		myIntegers.add(103);
		
		for (int i=0; i<myIntegers.size(); i++) {
			System.out.println("the int in my ArrayList is: " + myIntegers.get(i));
		}
	}

}