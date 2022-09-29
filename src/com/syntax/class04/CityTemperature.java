package com.syntax.class04;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What city do you live in?");
		
		String city = scan.next();
		
		System.out.println("What is the temperature in " + city + "?");
		
		int temperature = scan.nextInt();
		
		int celsius = ((temperature-32)*5)/9;
		
		System.out.println("The temperature in the " + city + " is " + celsius + " degrees in Celsius.");
		
		

	}

}
