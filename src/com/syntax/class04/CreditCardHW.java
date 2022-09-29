package com.syntax.class04;

import java.util.Scanner;

public class CreditCardHW {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Do you have a credit card? Please enter true or false");
		
		Boolean creditCard = scan.nextBoolean();
		
		if(creditCard == false) {
			System.out.println("We have some credit card offers that might interest you.");
		}else {
			System.out.println("What is the balance on the card?");
			int balance = scan.nextInt();
			if(balance>=1000) {
				System.out.println("Please pay that off immediately!");
			}else {
				System.out.println("You still have a balance you can spend before you have to pay it off.");
			}
		
		}
		

	}

}
