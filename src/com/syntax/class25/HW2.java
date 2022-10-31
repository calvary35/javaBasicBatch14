package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class HW2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>(7);
        drinks.add("coke");
        drinks.add("pepsi");
        drinks.add("gatorade");
        drinks.add("milk");
        drinks.add("orange juice");
        drinks.add("coffee");
        drinks.add("tea");
        Iterator<String> iterator = drinks.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            String drink = iterator.next();
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(count, "water");
            }
            count++;
        }
        System.out.println(drinks);
    }
}