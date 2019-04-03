package com.maktab.HW5.Q2;

public abstract class Book {
    private String title;
    protected double price;

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

    public abstract void setPrice();
}
