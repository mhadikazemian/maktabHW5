package com.maktab.HW5.Q1;

public class Magazine extends Readable {

    String type;//refers to category of the magazine subject

    Magazine(double price, int quantity, String name, String publication, String type){
        super(price, quantity,name, publication);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void description() {
        System.out.println("This is a magazine and its specifications are: ");
        System.out.println("Title: " + this.getName());
        System.out.println("publication: " + this.getPublication());
        System.out.println("Category: " + this.getType());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available quantity: " + this.getQuantity());
        System.out.println("************************************************");
    }
}//end of Magazine class
