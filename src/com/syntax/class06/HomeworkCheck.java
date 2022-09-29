package com.syntax.class06;
import java.util.Scanner;

public class HomeworkCheck {

	public static void main(String[] args) {
		

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter two strings");
	        String string1 = scan.nextLine();
	        String string2 = scan.nextLine();
	    System.out.println("Please enter two numbers");
	        int num1= scan.nextInt();
	        int num2 = scan.nextInt();

	        String output;

	        if(string1.equals(string2) && num1==num2){
	          output= "AND";
	        }else if(string1.equals(string2) || num1==num2){
	          output = "OR";
	        }else{
	          output = "NONE";
	        }

	        System.out.println(output);
	      }

	        

	        
	}


