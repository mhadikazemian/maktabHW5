package com.maktab.HW5.Q3;

public class OutgoingPhoneCall extends PhoneCall {

    //variables:
    double callDuration;

    //constructors:
    OutgoingPhoneCall(String phoneNumber, double callDuration) {
        super(phoneNumber);
        this.callDuration = callDuration;
        setPrice(0.04 * callDuration);
    }

    //Overriding abstract method:
    @Override
    public void getCallInfo() {
        System.out.println("Outgoing Phone Call: ");
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("The rate per minute: 0.04");
        System.out.println("Call duration: " + this.callDuration);
        System.out.println("Total price: " + (0.04 * this.callDuration));
        System.out.println("****************************");
    }//end of getCallInfo method

}//end of OutgoingPhoneCall class
