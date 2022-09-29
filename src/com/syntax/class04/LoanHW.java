package com.syntax.class04;

import java.util.Scanner;

public class LoanHW {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much of a loan are you looking for?");
		double loan = scan.nextDouble();
		
		if(loan<=200000) {
			System.out.println("Congratulations we can offer you the loan!");
			
		}else {
			System.out.println("I am sorry we will not be able to offer you the loan.");
		}
		
		

	}

}
