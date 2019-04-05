package com.maktab.HW5.Q3;

public abstract class PhoneCall {

    private String phoneNumber;
    private double price;

    PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

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
}
