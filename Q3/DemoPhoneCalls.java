package com.maktab.HW5.Q3;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        PhoneCall incomingPhoneCall = new IncommingPhoneCall("02188880000");
        PhoneCall outgoingPhoneCall = new OutgoingPhoneCall("02166660000", 5);
        incomingPhoneCall.getCallInfo();
        outgoingPhoneCall.getCallInfo();
    }




}
