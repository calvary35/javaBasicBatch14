package com.syntax.class14;

public class MethodsDemo2 {
    void printManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello java");

        }

    }
    /*
    in Parameters sequence and data type matters
     */
    void printCustomWordManyTimes(String word, int times){
        for (int i = 0; i <times ; i++) {
            System.out.println(word);

        }
    }

    public static void main(String[] args) {
        MethodsDemo2 md =new MethodsDemo2();
        md.printManyTimes(2);
        md.printCustomWordManyTimes("Joey B", 3);
    }
}
