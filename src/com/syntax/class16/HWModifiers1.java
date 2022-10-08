package com.syntax.class16;

public class HWModifiers1 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */

    int sumOfArray(int a[]){
        int sum=0;
        for (int i = 0; i < a.length ; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HWModifiers1 task= new HWModifiers1();
        int a[]={4,5,6,7,8};
        System.out.println(task.sumOfArray(a));

    }
}
