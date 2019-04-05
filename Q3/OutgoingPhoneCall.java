package com.maktab.HW5.Q3;

public class OutgoingPhoneCall extends PhoneCall {
    double callDuration;
    OutgoingPhoneCall(String phoneNumber, double callDuration){
        super(phoneNumber);
        this.callDuration = callDuration;
        setPrice(0.04 * callDuration);
    }

    @Override
    public void getCallInfo() {
        System.out.println("Outgoing Phone Call: ");
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("The rate per minute: 0.04");
        System.out.println("Call duration: " + this.callDuration);
        System.out.println("Total price: " + (0.04 * this.callDuration));
        System.out.println("****************************");

    }
}
