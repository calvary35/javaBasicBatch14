package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		int time=8;
		String day="Monday";
		/*
		 * it is called outer IF condition if it is true then only inner conditions will be checked if it is 
		 * false nothing from inner IF condition will be executed it is like the main door
		 * if main door is closed we can't enter the building
		 */
		
		//Outer IF-condition
		if(day.equals("Monday")) {//as String is a non-primitive we can't use == sign we have to use .equals method
			//Inner IF-conditions
			if(time>7) {
				
				System.out.println("Lets go to office");
				
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}
	

	}

}
