package com.syntax.class06;

import java.util.Scanner;

public class SeasonEnhancedCode {
	public static void main(String[] args) {
		System.out.println("What is your birth month?");
		Scanner scan = new Scanner(System.in);

		String season = null;

		String month = scan.nextLine();

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";

		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";

		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Autumn";

		} else {
			System.out.println("Invalid Month");
		}
		System.out.println("You were born in season " + season);
	}
}
