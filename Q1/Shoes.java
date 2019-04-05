package com.maktab.HW5.Q1;

public abstract class Shoes extends Product {

    //Shoes class variables:
    private int size;
    private String model;
    private String brand;
    private String color;

    //Shoes class constructors:
    Shoes(double price, int quantity, int size, String model, String brand, String color){
        super(price,quantity);
        this.size = size;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
    Shoes(){

    }

    //Shoes class constructors:
    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

}//end of shoes class
