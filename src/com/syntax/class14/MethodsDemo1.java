package com.syntax.class14;

public class MethodsDemo1 {

    /*
    A method that does not take any parameters and prints some lines on the console
     */
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    /*
    A method that takes a single parameter of type String and prints it
     */
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
       MethodsDemo1 obj = new MethodsDemo1();
        obj.printHello();
        obj.printWord("Bengals are the best");
        obj.printWord("Tottenham as well");
    }
}
