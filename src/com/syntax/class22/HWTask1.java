package com.syntax.class22;

public class HWTask1 {
    public static void main(String[] args) {
        Student[] students = {new Student(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student studentType : students) {
            studentType.askQuestions();
        }
        new SyntaxStudent().BrowseInternet();
        new CollegeStudent().listenMusic();
        new SchoolStudent().takeInitiative();

    }
}

class Student {

    void askQuestions() {
        System.out.println("The student will attend class");
    }
}

class SyntaxStudent extends Student {

    void askQuestions() {
        System.out.println("The Syntax student will ask Asghar questions about his wedding");
    }

    void BrowseInternet() {
        System.out.println("The Syntax student will browse the internet and miss what Asghar said");
    }
}

class CollegeStudent extends Student {
    @Override
    void askQuestions() {
        System.out.println("The college student will give reasons to Asghar why he was late to class");
    }

    void listenMusic() {
        System.out.println("The college student will listen to music through their headphones while Asghar is lecturing");
    }
}

class SchoolStudent extends Student {
    @Override
    void askQuestions() {
        System.out.println("The  school student will ask relevant questions to Asghar during lecture");
    }

    void takeInitiative() {
        System.out.println("The school student will watch every video Asghar posts before class");
    }
}
