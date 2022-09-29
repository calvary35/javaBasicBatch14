package com.syntax.class05;
import java.util.Scanner;
public class HeightinInches {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your height?");
		
		int height = scan.nextInt();
		
		if(height<60) {
			System.out.println("You are short");
			
		}else if(height>= 60 && height<72) {
			System.out.println("You are medium height");
			
		}else {
			System.out.println("You are tall");
		}

		
	}

}
