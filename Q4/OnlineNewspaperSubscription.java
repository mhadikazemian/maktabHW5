package com.maktab.HW5.Q4;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        if(address.contains("@")) {
            setRate(9);
            this.address = address;
        }
        else
            System.out.println("Your input Email is invalid...");
    }
}
