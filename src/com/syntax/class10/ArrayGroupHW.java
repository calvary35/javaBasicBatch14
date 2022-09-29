package com.syntax.class10;

public class ArrayGroupHW {

	public static void main(String[] args) {
		
		//Maximum and minimum number in the array?
		
		int[] numbers = { 380, 240, 984, 10002, 56179, 4321, 7433 };
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i <= numbers.length - 1; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			} 
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println();
		System.out.println("The smallest number is " + min);
	}

}
