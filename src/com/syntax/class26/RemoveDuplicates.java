package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.addAll(aList);
        System.out.println(list);
    }
}
