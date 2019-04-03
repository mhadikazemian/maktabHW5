package com.maktab.HW5.Q2;

public class NonFiction extends Book {

    NonFiction(String title) {
        setTitle(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(37.99);
    }
}
