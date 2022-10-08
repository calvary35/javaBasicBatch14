package ReviewClasses.reviewClass3;

import java.util.Scanner;

public class NestedIFMessingAround {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lets find out if you are a quality soccer player? ");

		System.out.println("Can you shoot?");

		String shoot = scan.next();

		System.out.println("Can you dribble");

		String dribble = scan.next();

		System.out.println("Can you pass?");

		String pass = scan.next();

		if (shoot.equalsIgnoreCase("yes")) {
			if (dribble.equalsIgnoreCase("yes")) {
				if (pass.equalsIgnoreCase("yes")) {
					System.out.println("You should try out for Tottenham!");
				}else {
					System.out.println("You need to learn how to pass for your teammates before the try out with the Lilywhites");
				}
			} else {
				System.out.println("Please improve your dribbling ability if you want to play in the Premier.");
			}
		} else {
			System.out.println("Improve your shooting abilities if you want to play striker!");
		}
	}

}
