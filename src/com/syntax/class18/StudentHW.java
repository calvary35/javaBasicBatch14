package com.syntax.class18;

public class StudentHW {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
    private String name;
    private String address;

    public StudentHW(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {


        System.out.println("The student's name is " + name + " and their address is " + address);
    }

    public static void main(String[] args) {
        new StudentHW("Kevin", "123 Main Street").displayInfo();


    }
}
