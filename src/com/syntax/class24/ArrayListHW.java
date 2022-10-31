package com.syntax.class24;

import java.util.ArrayList;

/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
public class ArrayListHW {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>(5);
        names.add("Kevin");
        names.add("Michael");
        names.add("Zach");
        names.add("Brian");
        names.add("Chris");
        System.out.println("Is the ArrayList names empty? : "+names.isEmpty());
        System.out.println("Does the ArrayList names contain Kevin? " + names.contains("Kevin"));
        System.out.println("What is the size of the ArrayList names? "+names.size());
        System.out.println("The names within the ArrayList are: "+ names);
        }


    }

