package com.syntax.class19;

public class ClassA {
    /*
    Write program to inherit class A that has method
     printF which is static and call or reuse that method into class B
     */
    static void printF() {

            System.out.println("Hello");
    }
}

class ClassB extends ClassA {


    }


class Testers {
    public static void main(String[] args) {

        ClassB.printF();
    }

}



