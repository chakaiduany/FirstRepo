package com.revature.practice;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! Please enter your name: ");
		
		String name = scan.nextLine();
		
		System.out.println("What's your favorite color?");

		String color = scan.nextLine();
		
		System.out.println("How old are you?");
		
		int age = scan.nextInt();
		
		scan.close();
		
		System.out.println("Hi, " + name + " you are " + age + " years old and your favorite color is " + color);
	}

}
