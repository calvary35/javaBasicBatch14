package com.syntax.class14;

public class Methods4 {
    boolean mystery(){
        return false;
    }
    String mystery2(int num){
        return "Java";
    }
    String method(String word){
        //return "Java";
        if(word.equals("Java")){
            return "python";
        }else{
            return "Java";
        }
    }

    public static void main(String[] args) {
        Methods4 methods4 = new Methods4();
        System.out.println(methods4.mystery());
        System.out.println(methods4.mystery2(5));
        System.out.println(methods4.method("python"));
    }
}
