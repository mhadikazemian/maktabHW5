package com.maktab.HW5.Q4;

public abstract class NewspaperSubscription {
    private String subscriberName;
    private String address;
    private double rate;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public double getRate() {
        return rate;
    }

    public String getAddress() {
        return address;
    }

    public abstract void setAddress(String address);
}
