package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//we use nextInt() if we want an int type of data from the keyboard
	
		System.out.println("Please enter your age");
		
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("Get to work!!!");
		}else {
			System.out.println("Get back to school!!!");
		}
		
		
		
		
	}

}
