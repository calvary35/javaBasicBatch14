package com.syntax.class06;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers and an operator");
		System.out.println("Enter your first number");
		int num1 = scan.nextInt();

		System.out.println("Enter your second number");
		int num2 = scan.nextInt();
		System.out.println("Enter your operator");
		char operator = scan.next().charAt(0);

		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;

		}
		
		System.out.println(result);
	}

}
