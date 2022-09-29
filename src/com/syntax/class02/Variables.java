package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Kevin";
		String lastName = "Smith";
		char grade = 'A';
		String city = "Miami";
		String state = "Florida";
		String phoneNumber = "123-456-7890";
		
		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I am an "  + grade + " " + "student ");
		System.out.println("I live in " + city + " " + state);
		System.out.println("And my phone number is " + phoneNumber);
		
		city = "NYC";
		state = "New York";
		phoneNumber = "789-456-3210";
		grade = 'B';
		
		System.out.println("My name is " + name + " " + lastName + " and I moved to " + city);
		System.out.println("My new phone number is "+ phoneNumber);
		System.out.println("My grade dropped from an A to a " + grade );
		
		//Rules for Identifiers = names (variables, methods, classes)
		//#1 rule- can not use keywords as Identifiers
		//String new ="Hello"; -error
		
		//#2 rule - cannot have spaces in identifiers
		//String last name = "Smith"; - error
		
		//#3 rule -identifiers cannot start with numbers
		//int 1number = 123; - error
		
		/*#4 rule - identifiers cannot contain any special characters
		 * except $ or _
		 * boolean hello! = true; - error
		 */
		double $price = 9.98;
		float _price1= 1.99f; //these work
		
		/*
		 * Naming Conventions
		 * 
		 * Class should start with Uppercase and then after that follow with camelCasing
		 * 
		 * 
		 */
		String Weather = "hot"; // not preferred
		String myWeather = "cold"; //preferred
		
		
				
		
		
		

	}

}