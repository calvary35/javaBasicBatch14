package com.syntax.class17;

public class Bike {



        /*
        Write a java class that will have a constructor: one with parameters and second without any parameters.
        Create a separate Test class where you will execute both of the constructors 1 by 1.
         */
        private String color;
        private int tires;
        private int gears;

        Bike(String bikeColor, int noOfTires, int noOfGears) {
            color = bikeColor;
            tires = noOfTires;
            gears = noOfGears;
        }

        Bike() {

        }

        void printBikeInfo() {
            System.out.println("The bike color is " + color + " and it has " + tires + " tires and " + gears + " gears " +
                    " on the bike.");
        }

    public static void main(String[] args) {

        Bike obj = new Bike("blue",2, 4);
        Bike obj2 = new Bike();
        obj.printBikeInfo();
        obj2.printBikeInfo();

            }

    }


