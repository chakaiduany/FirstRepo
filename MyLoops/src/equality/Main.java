package equality;

public class Main {

	public static void main(String[] args) {

		String s1 = new String("Puppy");
		String s2 = new String("Puppy");
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + s1.equals(s2));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// More Examples of equality operators and methods 
		// both equals() and == are used to compare 2 objects
		// .equals() is a method that checks for CONTENT (Content Comparison)
		// == is and operator that checks for the object's ADDRESS in the heap

		int x = 2;
		int y = 2;
		
		System.out.println(x == y);
		
		Integer number = new Integer(2);
		System.out.println(number == x); 
		
		Integer number1 = new Integer(2);
		Integer number2 = new Integer(2);
		
		System.out.println(number1 == number2);
		
		String s3 = "hello";
		String s4 = "hello";
		
		String s5 = new String("hi");
		String s6 = new String("hi");
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
	}

}
