package com.maktab.HW5.Q2;

public class Fiction extends Book {

    //Book class constructor:
    Fiction(String title) {
        setTitle(title);
        setPrice();
    }

    //Overriding the abstract method:
    @Override
    public void setPrice() {
        setPrice(24.99);
    }

}//end of Book class
