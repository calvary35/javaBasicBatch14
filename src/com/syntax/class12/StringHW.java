package com.syntax.class12;

import java.util.Scanner;

public class StringHW {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your favorite color");

        String input=scan.nextLine();
        if(!input.isEmpty()){
            if(input.length()%2!=0 && input.length()>3){
                System.out.println("The middle character is " + input.charAt(input.length()/2));

            }
        }
    }
}


