package com.syntax.class08;

public class LoopClockHW {

	public static void main(String[] args) {

		for (int hour = 0; hour <= 2; hour++) {
			for (int h2 = 0; h2 <= 9; h2++) {
				if (hour == 2 && h2 == 4) {
					break;
				}

				for (int minute = 0; minute <= 5; minute++) {
					for (int minute2 = 0; minute2 <= 9; minute2++) {
						System.out.println("The time is " + hour + h2 + ":" + minute + minute2);
					}

				}

			}
		}

	}
}
