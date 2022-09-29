package com.syntax.class09;

public class ArrayHW1 {

	public static void main(String[] args) {

		// 1. Create an array of cars and store 6 elements into it. Using 2 different
		// loops print all values from the array.
		String[] cars = new String[6];
		cars[0] = "Ford";
		cars[1] = "Toyota";
		cars[2] = "Suzuki";
		cars[3] = "Honda";
		cars[4] = "Mercedes";
		cars[5] = "BMW";
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		String[] carMakes = { "Ford", "Toyota", "Suzuki", "Honda", "Mercedes", "BMW" };
			for(String car:carMakes) {
				System.out.print(car + " ");
	
}
	}

}
