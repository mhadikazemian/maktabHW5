package com.maktab.HW5.Q1;

public abstract class Product {
    private double price;
    private int quantity;
    Product(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
    Product(){

    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public abstract void description();
}//end of Product class
