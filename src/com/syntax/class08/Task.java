package com.syntax.class08;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		
		/*from the range of 1 to 50 please find the sum of all even
		 * and all of odd numbers
		 */
int evenSum = 0;
int oddSum= 0;

for(int i = 1; i<=50;i++) {
	
	if(i%2==0) {
		evenSum = i + evenSum;
	}else if(i%2!= 0) {
		oddSum = i + oddSum;
	}
	
}
System.out.println(evenSum);
System.out.println(oddSum);

System.out.println("=======================");

Scanner scan = new Scanner(System.in);


int secretNumber = 38;
System.out.println("Can you guess the secret number?");
int guess = scan.nextInt();

while(guess!=secretNumber) {
	System.out.println("Please guess again!");
	guess = scan.nextInt();
}
System.out.println("Congrats you guessed the secret number!");
		
	}

}
