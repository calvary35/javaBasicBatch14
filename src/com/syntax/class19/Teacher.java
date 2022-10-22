package com.syntax.class19;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
     it their own features and behaviour. Test all 4 classes
     */
   protected String subject;
    protected String gradeLevel;
    protected int yearsOfExperience;

    Teacher(String subject, String gradeLevel, int yearsOfExperience) {
        this.subject = subject;
        this.gradeLevel = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    void teacherInfo() {
        System.out.println("The subject of the class is " + subject + " and the professor has taught for " + yearsOfExperience
                + " years. They are currently teaching " + gradeLevel+".");
    }
}
class MathTeacher extends Teacher{
       int salary;
       MathTeacher(String subject,String gradeLevel,int yearsOfExperience,int salary){
           super(subject, gradeLevel, yearsOfExperience);
           this.salary=salary;

       }
       void mathInfo(){
           System.out.println("The subject of the class is " + subject + " and the professor has taught for " + yearsOfExperience
                   + " years. They are currently teaching " + gradeLevel+". The math teacher makes "+salary+" a year.");
       }
}
class ChemistryTeacher extends Teacher{
    String degree;
    ChemistryTeacher(String subject,String gradeLevel,int yearsOfExperience,String degree){
        super(subject, gradeLevel, yearsOfExperience);
        this.degree=degree;
    }
    void degreeInfo(){
        System.out.println("The subject of the class is " + subject + " and the professor has taught for " + yearsOfExperience
                + " years. They are currently teaching " + gradeLevel+". The professor received a "+degree+".");
    }
}
class PianoTeacher extends Teacher{
    String favoritePianist;
    PianoTeacher(String subject,String gradeLevel,int yearsOfExperience, String favoritePianist){
        super(subject, gradeLevel, yearsOfExperience);
        this.favoritePianist=favoritePianist;
    }
    void pianoInfo(){
        System.out.println("The subject of the class is " + subject + " and the professor has taught for " + yearsOfExperience+
                " years. They are currently teaching " + gradeLevel+" The piano teacher's favorite pianist is "+favoritePianist+".");

    }
}
class testingProject{
    public static void main(String[] args) {
        new Teacher("History","5th grade", 4).teacherInfo();
        new MathTeacher("Geometry","10th grade",10,58000).mathInfo();
        new ChemistryTeacher("Advanced Organic Chemistry","11th Grade",15,"MS Chemistry").degreeInfo();
        new PianoTeacher("Baroque music","College",21,"Debussy").pianoInfo();
    }
}



