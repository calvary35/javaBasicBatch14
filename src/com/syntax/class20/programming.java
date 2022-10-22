package com.syntax.class20;

public class programming {
      /*
    Create a class named 'Programming'.
    While creating an object of the class, if nothing is passed to it, then the message "I love programming languages"
    should be printed. If some String is passed to it, then in place of "programming languages" the value variable
     should be printed. Example, if we pass "Java", then "I love Java" should be printed.
     */
    void programming(){

         System.out.println("I love programming languages");
    }
     void  programming(String str){
       System.out.println("I love "+ str);
    }
}
class testings{
    public static void main(String[] args) {
        programming task = new programming();
        task.programming();
        task.programming("Java");



    }
}
