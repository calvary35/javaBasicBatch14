package com.syntax.class04;

import java.util.Scanner;

public class MortgageHW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the mortgage rate for the house?");
		
		
		
		double mortgageRate = scan.nextDouble();
		
		
		if(mortgageRate <= 4.5) {
			System.out.println("I am interested in the house, how much does it cost?");
			
			int mortgage = scan.nextInt();
			
			if(mortgage <= 200000) {
				System.out.println("I will pay cash for the house.");
			}else {
				System.out.println("I will need to take a loan for the house.");
			}
		}else {
			System.out.println("The mortgage rate is too high, I am not interested.");
		}
	

	}

}
