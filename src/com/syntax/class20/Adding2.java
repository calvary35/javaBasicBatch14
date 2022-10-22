package com.syntax.class20;

public class Adding2 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private Adding2(int a, int b) {
        System.out.println(a + b);
    }

    private Adding2(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    private Adding2(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }


    public static void main(String[] args) {
        Adding2 task = new Adding2(12, 220);
        Adding2 task1 = new Adding2(24, 28, 30);
        Adding2 task3 = new Adding2(984, 321, 234, 50);
    }

}

