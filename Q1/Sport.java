package com.maktab.HW5.Q1;

public class Sport extends Shoes {

    private String type;//refers to type of sport that this shoe is appropriate for

    Sport(double price, int quantity, int size, String model, String brand, String color, String type){
        super(price, quantity, size, model, brand, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void description() {
        System.out.println("This is a sport shoe and its specifications are: ");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Suitable for: " + this.getType());
        System.out.println("Size: " + this.getSize());
        System.out.println("Color: " + this.getColor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available quantity: " + this.getQuantity());
        System.out.println("************************************************");
    }
}//end of Sport class
