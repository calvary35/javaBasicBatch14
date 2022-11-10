package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
// as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
// carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {
    String insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    Car(String carModel, String insuranceName) {
        super.insuranceName = insuranceName;
        this.carModel = carModel;
    }


    void getQuote() {
        System.out.println("Your quote for car insurance is $150 a month");
    }

    void cancelInsurance() {
        System.out.println("If you want to cancel insurance please call our automated line");
    }
}

class Pet extends Insurance {
    String petType;

    Pet(String petType, String insuranceName) {
        super.insuranceName = insuranceName;
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Your quote for pet insurance is $50 a month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Please call the veterinarian if you want to cancel your insurance");
    }
}

class Health extends Insurance {
    Health(String insuranceName) {
        super.insuranceName = insuranceName;
    }

    @Override
    void getQuote() {
        System.out.println("Your quote for health insurance is $80 a month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Please call your primary care physician to cancel your insurance");
    }
}

class test {
    public static void main(String[] args) {
        Car car = new Car("lumina", "Geico");
        Health health = new Health("BCBS");
        Pet pet = new Pet("Dog", "Progressive");

        ArrayList<Insurance> types = new ArrayList<>();
        types.add(car);
        types.add(pet);
        types.add(health);

        Iterator<Insurance> it = types.iterator();
        while (it.hasNext()) {
            var insurances = it.next();
            insurances.getQuote();
            insurances.cancelInsurance();
        }

    }


}

