package com.maktab.HW5.Q2;

public abstract class Book {

    //Book class variables:
    private String title;
    private double price;

    //Book class constructors:
    Book() {

    }

    Book(String title) {
        this.title = title;
    }

    //Book class getters and setters:
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void setPrice();
    
}//end of Book class
