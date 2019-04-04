package com.maktab.HW5.Q2;

public class BookArray {
    public static void main(String[] args) {
        Book[] arr = new Book[10];
        for (int i = 0; i < 10 ; i++) {
            int r = (int) (Math.random() * 2) + 1;
            if (r == 1) {
                arr[i] = new Fiction("Fiction");
                System.out.println("Fiction book's fields:  ");
                System.out.println("Title: " + arr[i].getTitle() + (i+1));
                System.out.println("Price: " + arr[i].getPrice());
                System.out.println("*******************");
            }
            if (r == 2){
                arr[i] = new NonFiction("NonFiction");
                System.out.println("NonFiction book's fields:  ");
                System.out.println("Title: " + arr[i].getTitle() + (i+1));
                System.out.println("Price: " + arr[i].getPrice());
                System.out.println("*******************");
            }


        }
    }
}
