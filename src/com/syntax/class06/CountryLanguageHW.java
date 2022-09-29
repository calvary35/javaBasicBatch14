package com.syntax.class06;
import java.util.Scanner;
public class CountryLanguageHW {

	public static void main(String[] args) {
		
		System.out.println("What country are you from?");
		
		Scanner scan = new Scanner(System.in);
		String country = scan.nextLine();
		
		String language;
		
		switch(country.toUpperCase()){
			case "ENGLAND":
				language = "English";
				break;
			case "SPAIN":
				language  = "Spanish";
				break;
			case "PORTUGAL":
				language  = "Portuguese";
				break;
			case "GERMANY":
				language  = "German";
				break;
			case "JAPAN":
				language  = "Japanese";
				break;
			case "GREECE":
				language = "Greek";
				break;
			default:
				language= "Unknown";
				break;
		}
		System.out.println("You are from " +country+ " and you speak " +language);

	}

}
