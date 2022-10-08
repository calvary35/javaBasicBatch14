package com.syntax.class16;
  /*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
*/

public class HWModifiers3 {
    private static String getVowels(String str){
        String str2 = str.replaceAll("[^aeiouAEIOU]","");

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(getVowels("hEllo my dear friends"));
    }
}

