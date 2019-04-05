package com.maktab.HW5.Q1;

public abstract class Product {

    //Product class variables:
    private double price;
    private int quantity;

    //Product class constructors:
    Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    Product() {

    }

    //Product class getters and setters:
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //description method that is abstract and describes objects in child classes:
    public abstract void description();

}//end of Product class
