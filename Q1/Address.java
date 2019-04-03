package com.maktab.HW5.Q1;

public class Address {
    private String state;
    private String city;
    private String street;
    private int ZIPCode;

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getZIPCode() {
        return ZIPCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZIPCode(int ZIPCode) {
        this.ZIPCode = ZIPCode;
    }
}
