package com.maktab.HW5.Q1;

public class Formal extends Shoes {

    String material;//this variable define the type of material of the formal shoe

    Formal(double price, int quantity, int size, String model, String brand, String color, String material){
        super(price, quantity, size, model, brand, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void description() {
        System.out.println("This is a formal shoe and its specifications are: ");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Size: " + this.getSize());
        System.out.println("Color: " + this.getColor());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available quantity: " + this.getQuantity());
        System.out.println("************************************************");

    }
}//end of Formal class
