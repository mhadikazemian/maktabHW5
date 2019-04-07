package com.maktab.HW5.Q1;

public class List {
    public void list(Product product[]) {
        for (int i = 0; i < product.length; i++) {
            System.out.println((i + 1) + ". ");
            product[i].description();
        }

    }
}//end of List class
