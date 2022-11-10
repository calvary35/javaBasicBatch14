package com.syntax.class26;

import java.util.Iterator;
import java.util.TreeSet;

/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */
public class NamesToCountries {
    public static void main(String[] args) {
        TreeSet<String>countries = new TreeSet<>();
        countries.add("Portugal");
        countries.add("Pakistan");
        countries.add("Kazakhstan");
        countries.add("Mongolia");
        countries.add("Solomon Islands");
        countries.add("Vanuatu");
        countries.add("Uruguay");

        Iterator<String>it = countries.iterator();
        while (it.hasNext()){
            String country = it.next();
            System.out.println(country);
        }
        for (String nation: countries){
            System.out.println(nation);
        }
    }
}
