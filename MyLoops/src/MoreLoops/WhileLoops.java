package MoreLoops;

public class WhileLoops {

	public static void main(String[] args) {

		int count = 0;
		while (count < 10) {
			System.out.println("looping " + count);
			count++;
			
			if (count == 7) {
				break;
			}
			
		}
		
		for(int i=0; i<10; i++) {
		System.out.println("in my for loop " + i);
		}
		
		String cat = "cat";
				for(int i=0; i<=cat.length()-1; i++) {
					System.out.println(cat.charAt(i));
					// System.out.println(cat.indexOf('c')); //these are some String API methods.
				}
				
	boolean flag = false;
	
	do {
		System.out.println("printing!!!");
	} while(flag == true);
	
	int value = 11;
	do {
		System.out.println("The do-while loop is looping!");
		
	} while (value < 10);

	}
}
