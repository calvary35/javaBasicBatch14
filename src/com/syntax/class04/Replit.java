package com.syntax.class04;

import java.util.Scanner;

public class Replit {

	
	
	      public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Please enter your gender: M or F");
	        String gender = scan.nextLine();
	        String F = "female";
	        String M = "male";

	        System.out.println("Please enter your age");

	        int age = scan.nextInt();

	        if(gender==F && age>=25 ){
	          System.out.println("Woman");
	          }else if(gender == M && age>=25){
	            System.out.println("Man");
	        }
	        if(gender == F && age<25){
	          System.out.println("Girl");
	          
	          }else if(gender == M && age<25){}
	            System.out.println("Boy");
	        }
	        
	          
	        

}


