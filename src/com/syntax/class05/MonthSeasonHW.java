package com.syntax.class05;
import java.util.Scanner;

public class MonthSeasonHW {

	public static void main(String[] args) {
		System.out.println("What is your birth month?");
		Scanner scan = new Scanner(System.in);
		
		String month = scan.nextLine();
		
		if(month.equals("December")|| month.equals("January")|| month.equals("February")) {
			System.out.println("Winter");
			
			}else if(month.equals("March")|| month.equals("April")|| month.equals("May")) {
			System.out.println("Spring");
			
			}else if(month.equals("June")|| month.equals("July")|| month.equals("August")) {
			System.out.println("Summer");
		
			}else if(month.equals("September")|| month.equals("October")|| month.equals("November")) {
			System.out.println("Autumn");

	}else {
		System.out.println("Invalid Month");
	}
	}
}


