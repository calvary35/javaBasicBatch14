package com.syntax.class06;

import java.util.Scanner;

public class SchoolGrades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your overall quiz grade:");
		int quiz = scan.nextInt();
		System.out.println("Please enter your overall midterm grade:");
		int midterm= scan.nextInt();
		System.out.println("Please enter your finals grade:");
		int finals= scan.nextInt();
		
		int average = (quiz+midterm+finals)/3;
		
		String grade;
		
		if(average >= 90 && average <=100) {
			grade = "A";
		}else if(average >=70 && average <90) {
			grade = "B";
		}else if(average >=50 && average <70) {
			grade = "C";
		}else if(average <50 && average>0) {
			grade = "F";
		}else {
			System.out.println("Please enter valid score.");
			grade ="None";
		}
		
System.out.println("Your grade in the class is " + grade);
	}

}
