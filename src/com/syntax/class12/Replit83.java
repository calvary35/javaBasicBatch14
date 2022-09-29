package com.syntax.class12;

public class Replit83 {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};

		int sum = 0;

		int[] array = new int[4];
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			sum = 0;

			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
				if (j == a[i].length - 1) {
					array[k] = sum;
					k++;
				}
			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
