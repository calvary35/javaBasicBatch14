package com.syntax.class06;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your current grade?");

		char grade = input.next().charAt(0);

		String data;

		switch (grade) {

		case 'A':
			data = "Grade : A. Outstanding! You might be able to teach this class!";
			break;
		case 'B':
			data = "Grade: B. Good job";
			break;
		case 'C':
			data = "Grade: C. This is an average grade please study more.";
			break;
		case 'D':
			data = "Grade: D. You are struggling in the class. Please devote more time to the course curriculum.";
			break;
		case 'F':
			data = "Grade F. You are failing. You might want to reconsider taking this class.";
			break;
		default:
			data = "unknown at this time. Please check back in.";
			break;
		}
		System.out.println("Your current grade is " + data);
	}

}
