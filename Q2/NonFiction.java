package com.maktab.HW5.Q2;

public class NonFiction extends Book {

    //NonFiction class constructor:
    NonFiction(String title) {
        setTitle(title);
        setPrice();
    }

    // Overriding the abstract method:
    @Override
    public void setPrice() {
        setPrice(37.99);
    }

}// end of NonFiction class
