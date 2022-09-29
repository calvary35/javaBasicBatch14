package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		String firstName = "Mina";
		String lastName= "Henen";
		String fullName=firstName+ " " + lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=houseNo + " "+ apartmentNo+ " " + streetName+ " " + city+" " +country;
	System.out.println(fullAddress);
	
	String incompleteAddress= houseNo+city;
	String step1="if we subtract 10 from 5 we get =" + 10;//results in a String
	//String step2= step1-5;//its not defined java does not understand what to do when we ask to subtract a String from a number
	
	
	
	System.out.println(" if we subtract 10 from 5 we get =" + (10-5));

	}

}
