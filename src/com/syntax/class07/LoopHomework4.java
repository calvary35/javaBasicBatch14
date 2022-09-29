package com.syntax.class07;
import java.util.Scanner;

public class LoopHomework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double cupOfCoffee = 2.99;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please pay for your cup of coffee");
		double price = input.nextDouble();
		
		while(price!=cupOfCoffee) {
			
			if(price>cupOfCoffee) {
				System.out.println("You're paying too much for a cup of coffee.");
			}else if(price<cupOfCoffee) {
				System.out.println("Good try a cup of coffee costs more than that.");
			}
			System.out.println("Please give the correct amount");
			price = input.nextDouble();
		}
		System.out.println("Please enjoy your coffee");
		

	}

}
