package com.syntax.class26;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String >cities = new LinkedHashSet<>();
        cities.add("Amsterdam");
        cities.add("London");
        cities.add("Chang Mai");
        cities.add("Montevideo");
        cities.add("Sydney");
        cities.add("New Delhi");
        cities.add("Tokyo");
        cities.add("Antwerp");

        Iterator <String> it = cities.iterator();
        while(it.hasNext()){
            String city = it.next();
            if(city.startsWith("A")) {
                it.remove();
            }
        }
        System.out.println(cities);
    }
}
