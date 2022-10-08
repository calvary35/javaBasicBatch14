package com.syntax.class14;

public class Task5 {
    public static void main(String[] args) {


    /*
    How would you check if String is palindrome or not? aba=> true
Abbc =>false

How would you swap  2 strings without a temporary variable?
     */
String str ="level";
        StringBuilder kevin = new StringBuilder("dad");
       kevin.reverse();
       if(kevin.toString().equals(str)){
           System.out.println("The string is Palindrome");
       }else{
           System.out.println("The string not Palindrome");

       }


    }
}
