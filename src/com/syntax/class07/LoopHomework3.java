package com.syntax.class07;

import java.util.Scanner;

public class LoopHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String answer= null;
		int a = 3;
		
		for(int i = 0;i<a;i++ ) {
		System.out.println("What is your name");
		answer = scan.nextLine();
		}
		System.out.println("Good afternoon " + answer);

	}

}
