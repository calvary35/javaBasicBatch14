package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {

		int time = 10;

		if (time < 12) {

			System.out.println("good morning");

		}
		/*infinite loop
		 * 
		 * while (time<12){
		 * 
		 * System.out.println("good morning");}
		 */

		while (time < 12) {

			System.out.println("good morning");
			time++;
		}

	}

}
