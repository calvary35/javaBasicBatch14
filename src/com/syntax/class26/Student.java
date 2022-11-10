package com.syntax.class26;

import java.util.HashSet;

/*
Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class Student {
    String name;
    int studentID;
    Student(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
    void studentInfo(){
        System.out.println("The student name "+name+" and the student ID "+studentID);
    }
    }
    class Mainn{
        public static void main(String[] args) {

            HashSet<Student>students= new HashSet<>();
            Student Kevin= new Student("Kevin", 41350);
            Student James = new Student("James", 41567);
            Student Claire = new Student("Claire",87521);
            Student Rebecca = new Student("Rebecca",45980);
            Student Audrey = new Student("Audrey",51287);
            students.add(Kevin);
            students.add(James);
            students.add(Claire);
            students.add(Rebecca);
            students.add(Audrey);

           for(Student student:students){
               student.studentInfo();
           }


        }
    }

