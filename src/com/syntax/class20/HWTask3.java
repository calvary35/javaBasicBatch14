package com.syntax.class20;

public class HWTask3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

}

class Adding {
    Adding(int a, int b) {
        System.out.println(a + b);
    }

    Adding(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    Adding(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}

class Test {
    public static void main(String[] args) {
        Adding task = new Adding(12, 24);
        Adding task1 = new Adding(24, 28, 30);
        Adding task3 = new Adding(984, 321, 234, 50);
    }
}
