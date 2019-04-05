package com.maktab.HW5.Q1;

public abstract class Readable extends Product {

    //Readable class variables:
    private String name;
    private String publication;

    //Readable class constructors:
    Readable(double price, int quantity, String name, String publication) {
        super(price, quantity);
        this.name = name;
        this.publication = publication;
    }

    Readable() {

    }

    //Readable class getters:
    public String getName() {
        return name;
    }

    public String getPublication() {
        return publication;
    }

}//end of readable class
