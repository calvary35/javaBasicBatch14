package com.syntax.class21;
/*
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
 */
public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{


    void getPrerequisite() {
        super.getPrerequisite();
    }
}
class Masters extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("You need a bachelor's degree to get a masters degree");
    }
}
class testit{
    public static void main(String[] args) {
        Degree task1=new Degree();
        task1.getPrerequisite();

        Bachelors task2= new Bachelors();;
        task2.getPrerequisite();

        Masters task=new Masters();
        task.getPrerequisite();
    }
}
