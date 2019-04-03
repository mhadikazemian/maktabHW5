package com.maktab.HW5.Q2;

public class Fiction extends Book {

    @Override
    public void setPrice(){
        this.price = 24.99;
    }
    Fiction(){
        setPrice();
    }
}
