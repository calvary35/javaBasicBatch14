package com.syntax.class05;
import java.util.Scanner;
public class CurrentTimeHW {

	public static void main(String[] args) {
		
		System.out.println("What time is it? Use 24 hour format.");
		Scanner scan = new Scanner(System.in);
		
		int time = scan.nextInt();
		
		if(time >=1 && time <=11) {
			System.out.println("Morning");
		}else if(time>=12 && time<= 15) {
				System.out.println("Afternoon");
			}else if(time >=16 && time<=20) {
				System.out.println("Evening");
			}else if(time>=21 && time<=24) {
				System.out.println("Night");
			}else {
				System.out.println("Invalid number");
			}
		}
	}
	


