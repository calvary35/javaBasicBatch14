package com.syntax.class14;

public class Task4 {
    public static void main(String[] args) {
        /*
         How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */
        String a = "This is sentence i want to reverse";
        for(int i =a.length()-1;i>=0;i--){
            char c = a.charAt(i);
            System.out.print(c);
        }
    }
}
