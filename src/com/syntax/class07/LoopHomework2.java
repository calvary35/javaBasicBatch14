package com.syntax.class07;

public class LoopHomework2 {

	public static void main(String[] args) {
		
		
		//Print odd numbers between 20 and 50 (2 ways)
		for (int e = 20; e <= 50; e++) {
			if (e % 2 == 1) {
				System.out.print(e + " ");
			}
		}System.out.println("==================================");
		for (int h = 20; h <= 50; h++) {
			if (!((h % 2)== 0)) {
				System.out.print(h + " ");
			}
		}
		

	}

}
