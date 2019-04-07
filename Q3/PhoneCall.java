package com.maktab.HW5.Q3;

public abstract class PhoneCall {

    //PhoneCall class variables:
    private String phoneNumber;
    private double price;

    //PhoneCall class constructor:
    PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    //getters and setters:
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public abstract void getCallInfo();

}//end of PhoneCall class
