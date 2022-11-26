package com.syntax.class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.4);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);



       /* var iterator=items.entrySet().iterator();
        while(iterator.hasNext()){

            var item= iterator.next();
            var key= item.getKey();
            var value = item.getValue();

            if(key.contains("e")&& value>10){
                iterator.remove();
            }
            System.out.println(items);
        } */

        items.entrySet().removeIf(entry -> entry.getKey().contains("e")&& entry.getValue()>10);

        System.out.println(items);
        //Using entrySet to print out values or keys of the map
        Collection<Map.Entry<String,Double>> item= items.entrySet();
        for(Map.Entry value: item){
            System.out.println(value.getKey());
        }
        System.out.println("**************************");
        //Using lambda forEach method to print out values or keys of the map
        items.forEach((key,value)-> System.out.println(key));

        }
        }



