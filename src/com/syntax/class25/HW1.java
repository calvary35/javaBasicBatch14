package com.syntax.class25;

import java.util.ArrayList;

//Create an arrayList of words. Remove every word that ends with “e”.
public class HW1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("baseball");
        words.add("jet ski");
        words.add("frisbee");
        words.add("bengals");
        words.add("duke");
        words.add("cheesesteak");
        words.add("purse");

        var iterator = words.iterator();
        while (iterator.hasNext()) {
            var item =iterator.next();
            if (item.endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
