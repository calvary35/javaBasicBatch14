package com.syntax.class17;

public class HWTask3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class:
      1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
    private String name;
    private int weight;
    private double height;

    private String surname;


    private HWTask3( int personalWeight) {

        weight = personalWeight;
    }
    public HWTask3(String lastName, double totalHeight) {
       surname  = lastName;
       height=totalHeight;
    }
    HWTask3(String publicName) {
        name=publicName;
    }
    protected HWTask3(int bigWeight, String firstName){
        weight=bigWeight;
        name=firstName;
    }

    public static void main(String[] args) {
        HWTask3 obj =new HWTask3(54);
        HWTask3 obj2= new HWTask3("Smith", 10.2);
        HWTask3 obj3 = new HWTask3("Johnny");
        HWTask3 obj4 = new HWTask3(540,"Tom");
    }
}
