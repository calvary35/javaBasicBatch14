package com.syntax.class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str= "kansjhjdfibj1234#$%^&AJASDJW";
        str =str.replaceAll("[^0-9A-Z]","");//replace all
        System.out.println("str = " + str);



        String sentence = " Batch 14 is great. Batch 14 is excellent? Batch 14 is just amazing.";
        String[] split = sentence.split("[.?]");//Split method
        System.out.println("split = " + Arrays.toString(split));

String str2 = " Batch 14 is great. Batch 14 is great";
String replace = str2.replaceFirst("great","Good");
        System.out.println(replace);
    }

}
