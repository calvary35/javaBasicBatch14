package com.syntax.class15;

public class Dog {
    String name;//instance variable
    static int noOfLegs = 4;//static variable
    String color;

    void bark() {
        int i = 10;//local variable
        for (int j = 0; j < i; j++) {
            //int j is also a local variable
            System.out.println("Barking....");
        }
    }

    void printInfo() {
        System.out.println("name " + name + " color " + color);
    }

    void printName() {
        System.out.println("name " + name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Tony";
        dog.bark();

        Dog dog2 = new Dog();
        dog2.name = "Lucky";
        System.out.println(HondaBike.noOfTyres);
    }

}
