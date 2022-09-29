package com.syntax.class07;

public class WhileLoopTasks {

	public static void main(String[] args) {

		// print numbers from 100 to 1

		int i = 100;

		while (i >= 1) {

			System.out.print(i + " ");
			i--;
		}
		System.out.println("======================");

		// Print even numbers from 20 to 100

		int even = 20;
		while (even <= 100) {
			if (even % 2 == 0) {
				System.out.print(even + " ");
			}
			even++;
		}
		System.out.println("==========================");

		// Print only odd numbers from 100 to 1 (2 Different Ways)
		
		int odd = 100;
		while (odd >= 1) {
			if (odd % 2 != 0) {
				System.out.print(odd + " ");
			}
			odd--;
		}
		System.out.println("==========================");
		
		
		int odd2 = 100;

		while (odd2 >= 1) {
			if (odd2 % 2 == 1) {
				System.out.print(odd2 + " ");
			}
			odd2--;
		}
	}

}
