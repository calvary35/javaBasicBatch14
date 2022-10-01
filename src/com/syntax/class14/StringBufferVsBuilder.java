package com.syntax.class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        //StringBuilder -Mostly used class, newer, better, faster
        StringBuilder stringBuilder = new StringBuilder("Today is java class");

        //StringBuffer- older one slow and not used mostly
        StringBuffer stringBuffer = new StringBuffer("Today is java class");
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

        String str = "Java is very easy";

        //How to convert from String to StringBuilder
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        //How to convert from StringBuilder to a String
        String newStr=stringBuilder1.toString();




    }


}
