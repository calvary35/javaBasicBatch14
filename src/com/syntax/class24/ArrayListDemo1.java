package com.syntax.class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Syntax to create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        //use add method to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        //getting all the elements through normal loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("*****************");
        //getting all the elements through an enhanced for loop
        for (String color : colors) {
            System.out.println(color);
        }
        //prints all the elements
        System.out.println(colors);
        // get method prints individual elements from arraylist
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        //size of arraylist
        System.out.println(colors.size());

    }
}
