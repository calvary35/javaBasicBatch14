package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		char choice = 'Y';
		String answer;
		
		
		switch(choice) {
		
		case 'Y':
			answer = "Yes";
			break;
		case 'N':
			answer="No";
		case 'M':
			answer = "Maybe";
		default:
			answer = "Unknown";
			break;
			
		}
System.out.println(answer);
	}

}
