package com.maktab.HW5.Q3;

public class OutgoingPhoneCall extends PhoneCall {
    double callDuration;
    OutgoingPhoneCall(String phoneNumber, double callDuration){
        super(phoneNumber);
        this.callDuration = callDuration;
    }
}
