package com.syntax.class04;

import java.util.Scanner;


public class DMVHW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age.");
		
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("We can issue you your driver's license.");
		}
		else {
			System.out.println("We can only offer you a driver's learning permit.");
		}
		
		
		

	}

}
