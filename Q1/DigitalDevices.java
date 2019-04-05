package com.maktab.HW5.Q1;

public abstract class DigitalDevices extends Product {
    private String brand;
    private String model;
    DigitalDevices(double price, int quantity, String brand, String model){
        super(price,quantity);
        this.brand = brand;
        this.model = model;
    }
    DigitalDevices(){

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}//end of DigitalDevices class
