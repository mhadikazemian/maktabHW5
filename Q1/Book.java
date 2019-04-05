package com.maktab.HW5.Q1;

public class Book extends Readable {
    private String author;

    Book(double price, int quantity, String name, String publication, String author){
        super(price, quantity,name, publication);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void description() {
        System.out.println("This is a book and its specifications are: ");
        System.out.println("Title: " + this.getName());
        System.out.println("author: " + this.getAuthor());
        System.out.println("publication: " + this.getPublication());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available quantity: " + this.getQuantity());
        System.out.println("************************************************");
    }
}//end of book class
