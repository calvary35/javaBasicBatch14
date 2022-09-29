package com.syntax.class07;

public class LoopHomework {

	public static void main(String[] args) {

		// Print numbers from 1 to 100 in 1 line with space
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println("==============");

		// Print numbers from 100 to 1
		for (int j = 100; j >= 1; j--) {
			System.out.print(j + " ");
		}
		System.out.println("====================");
		// Print even numbers from 20 to 1 (2 ways)
		for (int k = 20; k >= 1; k--) {
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
		}
		System.out.println("============");
		for (int m = 20; m >= 1; m--) {
			if (!((m % 2) == 1)) {
				System.out.print(m + " ");
			}
		}
	
	}

}
