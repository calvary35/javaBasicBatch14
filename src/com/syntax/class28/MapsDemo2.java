package com.syntax.class28;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.4);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);



        items.keySet().removeIf(key -> key.contains("e"));
        System.out.println(items);
    }
}
