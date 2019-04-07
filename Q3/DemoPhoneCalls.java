package com.maktab.HW5.Q3;

public class DemoPhoneCalls {

    public static void main(String[] args) {

        //Creating two new objects:
        PhoneCall incomingPhoneCall = new IncommingPhoneCall("02188880000");
        PhoneCall outgoingPhoneCall = new OutgoingPhoneCall("02166660000", 5);

        //Showing calls info in the output:
        incomingPhoneCall.getCallInfo();
        outgoingPhoneCall.getCallInfo();

    }//end of main method

}//end of DemoPhoneCalls class
