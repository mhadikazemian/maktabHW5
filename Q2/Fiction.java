package com.maktab.HW5.Q2;

public class Fiction extends Book {

    Fiction(String title) {
        setTitle(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(24.99);
    }
}
