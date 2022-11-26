package com.syntax.class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class HW3 {
    public static void main(String[] args) {
        HashMap<Integer, String>BestBuy = new HashMap<>();
        BestBuy.put(48751,"TV");
        BestBuy.put(90573,"XBOX");
        BestBuy.put(32875,"Printer");

        Set<Map.Entry<Integer,String>> items = BestBuy.entrySet();

        for(Map.Entry item:items){
            System.out.println(item);
        }

        }
    }

