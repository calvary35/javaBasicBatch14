package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love java programming";
		/*
		 * charAt returns us the character at a specific index
		 */
		for(int i=0;i<str.length();i++) {
			//print only the characters not spaces
			if(!(str.charAt(i)==' ')) {
			System.out.print(str.charAt(i)+ " ");
		}
	}

}
}