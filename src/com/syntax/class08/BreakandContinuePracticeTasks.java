package com.syntax.class08;

import java.util.Scanner;

public class BreakandContinuePracticeTasks {

	public static void main(String[] args) {
		
		
		
		for(int i =1; i<=50;i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " " );
		}
System.out.println("=========================");
		Scanner scan = new Scanner(System.in);
		
		double price= 50.0;
		String item= null;
		double newAmount;
		
			System.out.println("Please enter the item you wish to buy");
			String wish = scan.nextLine();
			System.out.println("What do you think the price of the item is?");
			double scanItem = scan.nextDouble();
			System.out.println("It is actually " + price);
		
		while(price!=scanItem) {
			if(price>scanItem) {
				newAmount = price - scanItem;
				System.out.println("You now owe " + newAmount);
				System.out.println("Please pay the remaining balance");
				scanItem= scan.nextDouble();
				newAmount = newAmount - scanItem;
				if(newAmount==0) {
					break;
				}
			}else if(price<scanItem) {
				newAmount = scanItem - price;
				System.out.println("You are owed " + newAmount);
				System.out.println("Let me get you what you are owed.");
				scanItem = scan.nextDouble();
				newAmount = newAmount - scanItem;
				if(newAmount ==0) {
					break;
				}
			}
		}
		System.out.println("Thank you for shopping");
		

	}

}
