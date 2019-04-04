package com.maktab.HW5.Q3;

public abstract class PhoneCall {
    String phoneNumber;
    double price;
    PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getPrice();

    public abstract String getPhoneNumber();

    public abstract void getCallInfo();
}
