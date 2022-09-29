package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		
		//String is just 1 example of non primitive data types
		
		
		String name = "Kevin";
		int age = 17;
		//String age = 7;//anything you put inside""
		
		String character = "A";
		//ctr+space auto completes the statement
		//syso +ctlr + space completes print statement
		System.out.println(name);
		
		//My name is " + Asma
		System.out.println("My name is " + name);
		
		//Asma is 17
		System.out.println(name + " is " + age);
		
		String fruit = "Apple";
		double price = 1.99;
		
		//The price of the apple is 1.99;
		
		System.out.println("The price of the " + fruit + " is " + price);
		
		fruit = "Mango";
		price = 5.99;
		
		System.out.println("The price of the " + fruit + " is " + price);
		
		
		/*to attach any value (int, double, boolean, char, String etc)
		 * to a String we use +
		 * + next to the String acts as Concatenation
		 */
	

	}

}