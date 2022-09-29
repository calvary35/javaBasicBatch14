package com.syntax.class09;

public class ArrayHW4 {

	public static void main(String[] args) {

		// 4. From an array of integer elements find the largest number.

		int[] numbers = { 315, 212, 198, 458, 871 };
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];

			}

		}
		System.out.println(max);

	}

}
