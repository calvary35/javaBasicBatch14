package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting => type = data type casting = converting 
		 * type casting is converting one data type to another
		 * 
		 * 
		 */
		
		byte box1= 127;// smallest box 8 bits
		short box2=3333;//slightly large box
		int box3 = 45454545; //large box most commonly used
		long box4=454545454;//slightly large box
		float box5= 41574987;//larger box
		double box6= 465766938; //largest box
		
		int number = (int)15.2; // we can't store the decimal number in a box of type int
		
		System.out.println(number);
		
		byte smallerBox = (byte) box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1; //we can do this because box 7 data type is larger than box1
		
		float box8 = (float)box6;//as box6 is larger it is double we need type casting to assign the data type
		System.out.println(box8);
		
		char a=(char)67;
		System.out.println(a);
		
		
		
		
		
		
		
		

	}

}
