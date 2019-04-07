package com.maktab.HW5.Q3;

public class IncommingPhoneCall extends PhoneCall{

    //Constructor:
    IncommingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice(0.02);
    }

    //Overriding abstract method:
    @Override
    public void getCallInfo() {
        System.out.println("Incoming Phone Call: ");
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("The rate: " + getPrice());
        System.out.println("The price: " + getPrice());
        System.out.println("****************************");
    }

}//end of incommingPhoneCall class
