package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
	
		String str="I love java programming";
		/*
		 * toCharArray will convert a String to an array of chars
		 */
		char[]arr=str.toCharArray();
		
		System.out.println(arr[5]);
		System.out.println(Arrays.toString(arr));
		
		int counter=0;
		for(char c:arr) {
			if(c=='a') {
				counter++;
			}
		}
System.out.println("letter a has appeared "+ counter+ " times");
	}

}
