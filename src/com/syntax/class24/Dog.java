package com.syntax.class24;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;

    public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }

    void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Name cannot be longer than 30 letters. Please try again");
        } else if (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please try again");
        } else {
            this.name = name;
        }
    }

    void setBreed(String breed) {
        if (breed.length() > 20) {
            System.out.println("Breed cannot be longer than 20 letters. Please try again");
        } else if (breed.isEmpty()) {
            System.out.println("Breed cannot be empty. Please try again");
        } else {
            this.breed = breed;
        }
    }

    void setAge(int age) {
        if (age > 15) {
            System.out.println("This is not a valid dog age. Please try again");
        } else if (age < 0) {
            System.out.println("Age cannot be negative. Please try again");
        } else {
            this.age = age;
        }
    }

    void setWeight(double weight) {
        if (weight > 140 || weight <= 0) {
            System.out.println("This is an invalid weight for a dog. Please try again");
        } else {
            this.weight = weight;
        }
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    int getAge() {
        return age;
    }

    double getWeight() {
        return weight;
    }

    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight);
    }
}

class Test {
    public static void main(String[] args) {
        Dog tommy =new Dog("tommy", "labrador", 4, 80);
        System.out.println(tommy.getName());
        tommy.printInfo();


    }

}
