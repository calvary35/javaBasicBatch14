package com.syntax.class11;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;

	void call() {
		System.out.println("calling.......");
	}

	void takePicture() {
		System.out.println("Taking pictures");
	}

	public static void main(String[] args) {

		// Name of class, variable name = new Name of Class();-- is the syntax for
		// calling a new object
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14";
		iphone.color = "Black";
		iphone.storage = 128;
		iphone.size = 6.8;
		iphone.cheap = false;
		System.out.println("Make " + iphone.make + " Model " + iphone.model);
		iphone.call();

		System.out.println("*****************");

		Phone samsungPhone = new Phone();

		samsungPhone.make = "Samsung";
		samsungPhone.model = "S222-Ultra";
		samsungPhone.color = "Gray";
		samsungPhone.storage = 256;
		samsungPhone.size = 6.7;
		samsungPhone.cheap = true;

		System.out.println(iphone.make);
		System.out.println(samsungPhone.make);

	}
}
