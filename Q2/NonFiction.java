package com.maktab.HW5.Q2;

public class NonFiction extends Book {

    @Override
    public void setPrice() {
        this.price = 37.99;
    }
    NonFiction(){
        setPrice();
    }
}
