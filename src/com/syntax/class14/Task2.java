package com.syntax.class14;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a string that should be a combination of letters, numbers, and special characters
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String str="dfhwjbfreiASDKWRG1235748%^&#*($";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str.length());

    }

}
