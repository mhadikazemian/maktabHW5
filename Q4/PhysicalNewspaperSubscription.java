package com.maktab.HW5.Q4;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    //Overriding abstract method:
    @Override
    public void setAddress(String address) {
        if (address.length() < 1) {
            System.out.println("Invalid address!");
            this.setRate(0);
        } else {
            this.setRate(15);
            this.address = address;
        }
    }
}//end of PhysicalNewspaperSubscription class
