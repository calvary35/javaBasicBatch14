package com.syntax.class16;

public class HWModifiers2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String reverse(String str) {

      /*
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversal = stringBuilder.toString();
       */


        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(HWModifiers2.reverse("whatsup"));
    }
}
