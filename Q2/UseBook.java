package com.maktab.HW5.Q2;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Harry Potter");
        NonFiction nonFiction = new NonFiction("Database Systems");
        System.out.println("Fiction book's fields:  ");
        System.out.println("Title: " + fiction.getTitle());
        System.out.println("Price: " + fiction.getPrice());
        System.out.println("*******************");
        System.out.println("NonFiction book's fields:  ");
        System.out.println("Title: " + nonFiction.getTitle());
        System.out.println("Price: " + nonFiction.getPrice());
    }


}
