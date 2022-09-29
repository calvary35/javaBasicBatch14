package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHungry = true;

		if (isHungry) {
			System.out.println("Lets eat something yummy");
		}
		if (3 > 2)
			System.out.println("There is a true statement inside parenthesis");
		double myBankBalance = 2000;
		double theAmountThatIWantToTransfer = 250;

		if (myBankBalance > theAmountThatIWantToTransfer) {
			System.out.println("Funds transferred successfully");
		} else {
			System.out.println("Please try again not enough balance");
		}
		int money = 100000000;

		if (money > 100000) {
			System.out.println("I am rich");
			System.out.println("I can go on vacations");
			System.out.println("I can buy a Tesla");

		} else {
			System.out.println("I need to save more");
		}

	}

}
