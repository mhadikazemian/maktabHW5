package com.maktab.HW5.Q1;

public class Radio extends DigitalDevices{

    Radio(double price, int quantity, String brand, String model){
        super(price, quantity, brand, model);
    }

    @Override
    public void description() {
        System.out.println("This is a radio and its specifications are: ");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available quantity: " + this.getQuantity());
        System.out.println("************************************************");


    }
}//end of Radio class
