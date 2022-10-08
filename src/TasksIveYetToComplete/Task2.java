package TasksIveYetToComplete;

import java.util.Scanner;

public class Task2 {

    //Create a method that will take a number and prints whether the number is even or odd./

    void printEvenOdd(int number){

        if(number%2==0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();
        Task2 obj = new Task2();
        obj.printEvenOdd(num);
    }
}
