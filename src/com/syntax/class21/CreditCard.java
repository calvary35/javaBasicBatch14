package com.syntax.class21;

/*

Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */
public class CreditCard {
    double balance;
    double interest;

    CreditCard(double balance, double interest) {
        this.interest = interest;
        this.balance = balance;
    }

    double calculateInterest() {
        interest = (balance * interest) / 100;
        return interest;
    }
}

class Visa extends CreditCard {

    Visa(double balance, double interest) {
        super(balance, interest);
        calculateInterest();
    }


}

class AX extends CreditCard {
    AX(double balance, double interest) {

        super(balance, interest);
    }


    double calculateInterest() {
        interest = (balance / 100) * interest;
        return interest;

    }
}

class testthis {
    public static void main(String[] args) {
        CreditCard task = new CreditCard(45000, .08);
        System.out.println(task.calculateInterest());

        Visa task1 = new Visa(1000, .15);
        System.out.println(task1.calculateInterest());

        AX task2 = new AX(12000, .24);
        System.out.println(task2.calculateInterest());
    }
}


