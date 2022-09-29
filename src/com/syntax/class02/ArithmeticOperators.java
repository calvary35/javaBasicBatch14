package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// +, -, *, /, %(modulus is for remainder of division)
		
		
		int a = 900;
		int b = 100;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		int c = 10;
		int d = 3;
		
		int sum = c+d;
		int sub = c-d;
		int remainder = c%d; // 10%3 = 1
		int div = c/d; //10/3 = 3  (need a double or float to bring full decimal answer out)
	
		
		
		System.out.println("Sum is " + sum);
		System.out.println("Sub is " + sub);
		System.out.println("Remainder is " + remainder);
		System.out.println("Div is  = " + div);
		
		double num1 = 10.0;
		double num2= 3.0;
		
		System.out.println(num1/num2);
		
		
		System.out.println("-------------");
		
		
		int e = 10;
		int f = 4;
		
		System.out.println("division = " + e/f);//2
		System.out.println("remainder = " + e%f);//2
		
		//remainder - % - mod operator
		
		
		
	}

}
