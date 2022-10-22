package com.syntax.class17;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
    with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */

    private String studentName;
    private int mathGrade;
    private int historyGrade;
    private int scienceGrade;

    Students(String name, int math, int history, int science) {
        studentName = name;
        mathGrade = math;
        historyGrade = history;
        scienceGrade = science;


    }


     void calculateAvgGrade() {

         System.out.println(studentName+ "'s average grade between the three courses is: "+
                 (mathGrade + historyGrade+scienceGrade)/3);
    }

    public static void main(String[] args) {
        new Students("Kevin", 84, 75, 94).calculateAvgGrade();

         new Students("Chris", 89, 94, 75).calculateAvgGrade();

        new Students("James", 84, 97, 92).calculateAvgGrade();

        new Students("Michael", 92, 94, 91).calculateAvgGrade();

         new Students("Zach", 98, 88, 91).calculateAvgGrade();





    }
}

    

