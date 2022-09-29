package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {
		// find the largest number and then find the if the largest number
		// is even or odd

		int num1 = 110;
		int num2 = 120;
		int num3 = 130;

		int largest;

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		if(largest!=0) {
			if (largest % 2 == 0) {
				System.out.println("is an Even number.");
			} else {
				System.out.println("is an Odd number.");
		}
		
		
		}
	}

}
