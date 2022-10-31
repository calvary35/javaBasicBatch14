package com.syntax.class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLiner");
        makeUpItem.add("Lipstick");

        ArrayList<String>  cosmetics = new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("lotion");

        ArrayList <String> beautyProducts = new ArrayList<>();
        //adds everything from makeUpItem to beautyProducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("lotion");// only removes one item
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics);
        System.out.println(beautyProducts);//removes all items that are passed in the argument
        beautyProducts.clear(); // removes everything
        System.out.println(beautyProducts);

    }
}
