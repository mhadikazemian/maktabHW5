package com.maktab.HW5.Q2;

public abstract class Book {
    private String title;
    private double price;

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
