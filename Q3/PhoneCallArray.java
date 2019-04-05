package com.maktab.HW5.Q3;

import java.util.Scanner;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[8];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8 ; i++) {
            int r = (int)((Math.random() * 2) + 1);
            if(r == 1){
                System.out.println("Enter the incoming phone number: ");
                phoneCalls[i] = new IncommingPhoneCall(scanner.next());
                phoneCalls[i].getCallInfo();
            }
            if(r == 2){
                System.out.println("Enter the out going phone number and call duration: ");
                phoneCalls[i] = new OutgoingPhoneCall(scanner.next(),scanner.nextDouble());
                phoneCalls[i].getCallInfo();
            }

        }
    }
}
