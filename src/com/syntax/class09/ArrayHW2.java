package com.syntax.class09;

public class ArrayHW2 {

	public static void main(String[] args) {
		
		//2. Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		
		String[]animals = new String[5];
		animals[0]= "Lion";
		animals[1]="Tiger";
		animals[2]="Cheetah";
		animals[3]="Jaguar";
		animals[4]="Panther";
		
		for(int i = 0; i<animals.length;i++) {
			System.out.print(animals[i]+ " ");
		}
		System.out.println();
	String[]bigCats= {"Lion", "Tiger", "Cheetah", "Jaguar","Panther"};
	for(String largeCats:bigCats) {
		System.out.print(largeCats + " ");
	}
				

	}

}
