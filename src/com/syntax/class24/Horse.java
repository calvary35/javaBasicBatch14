package com.syntax.class24;

/*
    create a horse class
    have 5 fields of your choice
    create constructor and getter setter methods for this class
    atleast writer one condition inside setter class
     */
public class Horse {
    private String breed;
    private int age;
    private double weight;
    private String name;
    private String color;

    public Horse(String breed, int age, double weight, String name, String color) {
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setName(name);
        setColor(color);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("This is an invalid response. Please try again");
        } else {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 40 || age < 0) {
            System.out.println("This is an invalid response. Please try again");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }



    public void setWeight(double weight) {
        if (weight > 200 || weight < 0) {
            System.out.println("This is an invalid response. Please try again");
        } else {
            this.weight = weight;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("invalid response. Please try again");
        } else {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("invalid response. Please try again");
        } else {
            this.color = color;
        }
    }
    void horseInfo() {
        System.out.println("The name of the horse is " + name + " and it's color is " + color + " it weighs " + weight + ". " + name + " is" +
                " " + age + " years old. and the breed of " + name + " is " + breed);
    }
}

class Testing {
    public static void main(String[] args) {
        Horse misty = new Horse("stallion", 31, 180, "Misty", "brown");
        System.out.println(misty.getAge());
        System.out.println(misty.getBreed());
        System.out.println(misty.getColor());
        System.out.println(misty.getName());
        System.out.println(misty.getWeight());
        misty.horseInfo();
    }
}
