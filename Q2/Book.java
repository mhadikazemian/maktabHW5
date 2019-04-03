package com.maktab.HW5.Q2;

public abstract class Book {
     private String title;
     private double price;

    Book(){

    }

    Book(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void setPrice();
}
