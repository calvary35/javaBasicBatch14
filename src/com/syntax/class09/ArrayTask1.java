package com.syntax.class09;

public class ArrayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).


Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */

		char[] grades = new char[6];
		grades[0]= 'A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]= 'F';
		
		System.out.println(grades[5]);
		
	char [] grade= {'A','B','C','D','E','F'};
	for(int i=0; i<grade.length;i++) {
		System.out.print(grade[i] + " ");
	}
	//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
System.out.println();
	
	String[]names = new String [4];
	names[0]= "Kevin";
	names[1]="Romel";
	names[2]="Seden";
	names[3]="Asma";
	System.out.println(names[0]);
	
	String[]group = new String[] {"Kevin", "Romel", "Seden", "Asma"};
	System.out.println(group[0]);
	
	//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
	
	String []words = new String[5];
	words[0] = "Java";
	words[1]="Saturday";
	words [2]= "Day";
	words[3]= "coding";
	words[4]="is";
	System.out.println(words[1]+" "+ words[4]+ " " + words[0]+ " "+ words[3]+ " " + words[2]);
	}

}
