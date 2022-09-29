package com.syntax.class09;

public class ArrayHW3 {

	public static void main(String[] args) {
		//3. Create an array on integers and calculate the sum of all elements in an array
		
		int sum=0;
		
		int []numbers= new int[5];
		
		numbers[0]= 315;
		numbers[1]= 212;
		numbers[2]= 198;
		numbers[3]=458;
		numbers[4]=871;
		for(int i=0;i<numbers.length;i++) {
			sum += numbers[i];
		}
		System.out.println("The sum of the numbers is: " + sum);
		
		
	

	}

}
