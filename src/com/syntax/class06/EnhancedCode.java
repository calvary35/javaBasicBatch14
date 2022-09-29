package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
	
			
			System.out.println("What time is it? Use 24 hour format.");
			Scanner scan = new Scanner(System.in);
			
			int time = scan.nextInt();
			
			String timeOfTheDay;
			
			if(time >=1 && time <=11) {
				timeOfTheDay="Morning";
			}else if(time>=12 && time<= 15) {
					timeOfTheDay = "Afternoon";
				}else if(time >=16 && time<=20) {
					timeOfTheDay ="Evening";
				}else if(time>=21 && time<=24) {
					timeOfTheDay ="Night";
				}else {
					System.out.println("Invalid number");
					timeOfTheDay = "Invalid";
				}
			System.out.println(timeOfTheDay);
			}
		

	}


