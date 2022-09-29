package reviewClass3;

import java.util.Scanner;

public class YesNoExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String batch14 = scanner.next();
		if(batch14.equalsIgnoreCase("yes")) {
			
			System.out.println("You are amazing");
		}else {
			
			System.out.println("You are good");
		}

	}

}
