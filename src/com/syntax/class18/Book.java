package com.syntax.class18;

 class Book {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure: Instance variables are being initialized
Both Constructors are being executed
     */

    private String subject;
    private int noOfpages;


    public Book(String subject, int noOfpages) {
        this.subject = subject;
        this.noOfpages = noOfpages;
    }

   public Book() {
        System.out.println("I'm not a fan of this book");
    }

    void bookInfo() {
        System.out.println("This book has " + noOfpages + " pages and its subject is " + subject);
    }


    public static void main(String[] args) {
        new Book("history", 400).bookInfo();
        new Book();
    }
}
