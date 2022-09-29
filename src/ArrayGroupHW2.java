
public class ArrayGroupHW2 {

	public static void main(String[] args) {
	
		//Write a java program to find the second largest number in the array?


		int[] numbers = { 380, 240, 984, 10002, 56179, 4321, 7433 };

		int max = numbers[0];
		int secondLargest = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				secondLargest = max;

				max = numbers[i];
			}
		}

		System.out.println("The max value of the array is " + max);
		System.out.println();
		System.out.println("The second largest value of the array is " + secondLargest);
	}

}
