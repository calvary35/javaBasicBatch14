package com.syntax.class08;

public class NestedForLoopsReplits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			for (int a = 1; a <= 5; a++) {
				System.out.print(a + " ");

				for (int b = a; b < (a * 10);) {
					b = a + b;
					System.out.print(b + " ");
				}

				System.out.println("");
			}
		}
	}
}
