package com.maktab.HW5.Q1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Instantiating objects and variables of application:
        OnlineStore onlineStore = new OnlineStore();
        Book book = new Book(10.0, 10, "Harry Potter", "Pearson", "J.K.Rolling");
        Book book2 = new Book(20.0, 10, "The Gambler", "Classic", "Dostoevsky");
        Magazine magazine = new Magazine(5.0, 40, "National Geography", "NG", "Documentary");
        Formal formal = new Formal(15.0, 15, 40, "m1", "Ecco", "Black", "Leather");
        Formal formal2 = new Formal(35.0, 10, 42, "m2", "Gucci", "Brown", "Cotton");
        Sport sport = new Sport(40.0, 12, 38, "m3", "Puma", "Orange", "Tennis");
        Sport sport2 = new Sport(39.99, 25, 39, "m4", "361", "Blue", "Hiking");
        Radio radio = new Radio(20.0, 20, "Sony", "m342");
        TV tv = new TV(500, 10, "LG", "L55", 55);
        TV tv2 = new TV(650, 10, "Samsung", "K60", 60);
        TV tv3 = new TV(1000, 5, "LG", "L75", 75);

        //The following array holds every Product object available at this online store:
        Product[] products = {book, book2, magazine, formal, formal2, sport, sport2, radio, tv, tv2, tv3};

        //Using userSignUp method from onlineStore class to sign up a new user:
        onlineStore.userSignUp();

        //Creating a new cart for the new user:
        Cart cart = new Cart();

        // u variable has been used to iterate do-while loop:
        int u = 0;

        //The following loop continues until user wants to exit from it(u = 1):
        do {
            //Messages that appears on the screen so the user could choose from them:
            System.out.println("1: Adding an item to your cart");
            System.out.println("2: Removing an item from your cart");
            System.out.println("3: Seeing the items that are in your cart");
            System.out.println("4: Submitting your purchase");
            System.out.println("5: Seeing the total price of your cart");
            System.out.println("6: Seeing available products at store");
            System.out.println("7: Exit");

            //Getting the input number from user and continuing the program base on input number:
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Please insert the number refers to the item that you want to buy");
                    int num = scanner.nextInt();
                    System.out.println("How many of this item do you want to purchase? (Max = 5)");
                    int order = scanner.nextInt();
                    cart.addToCart(products, num, order);
                    break;
                case 2:
                    cart.showCart();
                    System.out.println("Enter the number refers to the item you want to remove");
                    cart.removeFromCart(scanner.nextInt());
                    break;
                case 3:
                    cart.showCart();
                    break;
                case 4:
                    cart.submit();
                    break;
                case 5:
                    cart.bill();
                    break;
                case 6:
                    onlineStore.setList(products);
                    break;
                case 7:
                    u = 1;
                    break;
            }
        } while (u == 0);

    }//end of main method

}//end of Q1 class
