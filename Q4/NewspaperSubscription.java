package com.maktab.HW5.Q4;

public abstract class NewspaperSubscription {

    //Class variables:
    private String subscriberName;
    protected String address;
    private double rate;

    //getters and setters
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

    public void setRate(double rate) {
        this.rate = rate;
    }
}//end of NewspaperSubscription
