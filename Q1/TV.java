package com.maktab.HW5.Q1;

public class TV extends DigitalDevices {

    //TV class variables:
    double inch;

    //TV class constructors:
    TV(double price, int quantity, String brand, String model, double inch) {
        super(price, quantity, brand, model);
        this.inch = inch;
    }

    //TV class getters:
    public double getInch() {
        return inch;
    }

    //The following method describes each object of TV class:
    @Override
    public void description() {
        System.out.println("This is a TV and its specifications are: ");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Size(inch): " + getInch());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available quantity: " + this.getQuantity());
        System.out.println("************************************************");
    }
}//end of TV class
