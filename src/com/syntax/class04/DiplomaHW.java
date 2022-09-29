package com.syntax.class04;

import java.util.Scanner;

public class DiplomaHW {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Do you have a diploma? Please enter true or false");
		
		boolean hasDiploma= scanner.nextBoolean();
		if(hasDiploma) {
			System.out.println("What is your gpa?");
			
			double GPA = scanner.nextDouble();
			if(GPA >= 3.5) {
				System.out.println("You are elgibile for scholarship!");
			}else {
				System.out.println("You should have studied harder!");
			}
				
		}
		else {
			System.out.println("Enroll back into school to get your diploma.");
		}
		

	}

}
