package com.syntax.class20;

public class HWTask1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box

Use separate class to test your code
     */


      void  calculateAreaSquare(int a){
          System.out.println(a*a);
        }
        void calculateAreaRectangle(int a, int b){
            System.out.println(a*b);
        }
        void calculateAreaBox(int a, int b,int c){
            System.out.println(a*b*c);
        }
    }


class testing{
    public static void main(String[] args) {
       HWTask1 task=new HWTask1();
      task.calculateAreaRectangle(4,3);
      task.calculateAreaSquare(20);
      task.calculateAreaBox(8,14,12);

    }
}
