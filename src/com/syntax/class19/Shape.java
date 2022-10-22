package com.syntax.class19;

/*
Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
 In circle class create a method to calculate the area of circle. Test your code
 */
public class Shape {

   int radius;
    Shape(int radius){
        this.radius=radius;
    }

}
class circle extends Shape{

    circle( int radius){
        super(radius);


    }
    void calculateArea(){
        double area;
        area=3.14*radius*radius;
        System.out.println(area);
    }
}
class testing2{
    public static void main(String[] args) {
        new circle(8).calculateArea();
    }
}
