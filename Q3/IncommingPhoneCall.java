package com.maktab.HW5.Q3;

public class IncommingPhoneCall extends PhoneCall{
    IncommingPhoneCall(String phoneNumber){
        super(phoneNumber);
        this.price = 0.02;
    }

    @Override
    public void getCallInfo() {
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("The rate: " + this.price);
        System.out.println("The price: " + this.price);
    }
    
}
