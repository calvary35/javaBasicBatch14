package com.syntax.class04;

import java.util.Scanner;

public class EmployeesSalaryAndBonus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many years have you worked with the company?");

		int numberOfYearsWorked = scan.nextInt();
		if (numberOfYearsWorked >= 5) {
			System.out.println("Congratulations you are eligible for the bonus.");

			System.out.println("What is your current annual salary?");

			double annualSalary = scan.nextDouble();

			if (annualSalary >= 50000) {
				System.out.println("Your bonus for the year is $5000.");
			} else {
				System.out.println("Your bonus for the year is $3000.");
			}
		} else {
			System.out.println("Due to working only " + numberOfYearsWorked + " years at the company you are not eligible for the bonus.");

		}

	}

}
