package com.syntax.class28;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {
        TreeMap <String,String> countryCapital = new TreeMap<>();

        //Create a map of countries with its capital that will store countries in alphabetical order.
        countryCapital.put("Japan","Tokyo");
        countryCapital.put("Italy","Rome");
        countryCapital.put("Portugal","Lisbon");
        countryCapital.put("Nigeria","Lagos");
        countryCapital.put("New Zealand","Auckland");
        countryCapital.put("Chile","Santiago");
        countryCapital.put("Cook Islands","Rarotonga");
        countryCapital.put("Iceland","Reykjavik");
        countryCapital.put("USA","DC");
        countryCapital.put("Slovakia","Bratislava");

        //Print all keys and values from a country map using for each loop and iterator.
        Set<Map.Entry<String,String>>countries= countryCapital.entrySet();

        for(Map.Entry country: countries){
            System.out.println(country);
        }
        System.out.println("**************");
      //  Iterator<Map.Entry<String,String>> country = countryCapital.entrySet().iterator();
        var country = countryCapital.entrySet().iterator();
        while(country.hasNext()){
         var order =country.next();

            System.out.println(order.getKey()+"="+order.getValue());
        }
        System.out.println("**************************");
        //Print all values from a country map using for each loop and iterator.

        for(Map.Entry value: countries){
            System.out.println(value.getValue());
        }
        System.out.println("*************************");
        var values= countryCapital.entrySet().iterator();
        while(values.hasNext()){
            var value = values.next();
            System.out.println(value.getValue());

        }

    }
}
