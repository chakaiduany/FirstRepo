package libraries;

import java.util.Arrays;

import AnotherPackage.MyUtils;

public class Driver {

	public static void main(String[] args) {

		int[] values = new int[5];
		
		for(int i = 0; i<=values.length-1; i++);{
			int i = 0;
			values[i] = i + 1;
			System.out.println(values[i]);
		}
		String s = "cat";
		System.out.println("The length of s is: " + s.length());
		
		int[] numbers = {42, 106, 87, 2, 0};
		
		System.out.println(numbers);
		
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		int n = MyUtils.addAThousand(12);
		
		System.out.println("My number plus 1000 is: " + n);
	}

}
