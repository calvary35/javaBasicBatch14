package com.syntax.class13;

import java.util.Scanner;

public class HWFromLastNightTask3 {

	public static void main(String[] args) {

		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS). Write a
		 * program that reads two people's first names and if they expecting boy or
		 * girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
		String motherName;
		String fatherName;
		String gender;
		String firstHalf;
		String secondHalf;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of mother");
		motherName=scan.nextLine();
		System.out.println("Please enter the name of father");
		fatherName=scan.nextLine();
		
		System.out.println("Are you expecting a boy or girl? ");
		gender=scan.nextLine();
		

		if (gender.equalsIgnoreCase("boy")) {
			firstHalf = fatherName.substring(0, fatherName.length() / 2);
			secondHalf = motherName.substring(motherName.length() / 2);
			
		} else {
			firstHalf = motherName.substring(0, motherName.length() / 2);
			secondHalf = fatherName.substring(fatherName.length() / 2);
			

		}
		System.out.println(firstHalf+secondHalf);
	}

}
