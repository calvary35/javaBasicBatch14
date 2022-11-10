package com.syntax.class26;

import java.util.LinkedList;

/*
Create a Card class that will have implemented
 and unimplemented methods and a constructor that will initializes credit card type.
 Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
 Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class CreditCard {

    String creditCardBrand;
    CreditCard(String creditCardBrand){
        this.creditCardBrand=creditCardBrand;
    }
   void creditCardDeclined(){
       System.out.println("Your "+creditCardBrand+" card was declined. Do you have another card?");
    }
    abstract void maxLimitAllowed();
}
class Visa extends CreditCard{
    Visa(String creditCardBrand){
        super(creditCardBrand);
    }
    void maxLimitAllowed(){
        System.out.println("The max limit on your card is $20000");
    }
}
class Amex extends CreditCard{
    Amex(String creditCardBrand){
        super(creditCardBrand);
    }
    void maxLimitAllowed(){
        System.out.println("The max limit on your card is $10000");
    }
}
class MasterCard extends CreditCard {
    MasterCard(String creditCardBrand) {
        super(creditCardBrand);
    }

    void maxLimitAllowed() {
        System.out.println("The max limit on your card is $50000");
    }
}
class Main{
    public static void main(String[] args) {
Visa visa = new Visa("Visa Express");
Amex amex = new Amex("Amex Gold");
MasterCard masterCard= new MasterCard("Mastercard Black");

        LinkedList<CreditCard>cards = new LinkedList<>();
        cards.add(visa);
        cards.add(amex);
        cards.add(masterCard);
        for (CreditCard card: cards){
            card.creditCardDeclined();
            card.maxLimitAllowed();
        }

    }
}