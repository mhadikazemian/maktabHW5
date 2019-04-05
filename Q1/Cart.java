package com.maktab.HW5.Q1;


public class Cart {

    //Cart class variables:
    private Product[] purchase = new Product[5];
    private double totalPrice;
    private int m;//refers to number of filled indexes of the purchase array

    //Cart class constructor:
    Cart() {
        m = 0;
    }

    //The following method shows every item that there is in the user's cart:
    public void showCart() {
        int i = 0;
        while (i < 5) {
            int k = 1;//it counts how many identical products are in a cart
            for (int j = 0; j < 5; j++) {
                //the if condition is for not to count a counted product again
                if (i < j) {
                    if (purchase[i] == (purchase[j])) {
                        k++;
                    }
                }
            }
            if (purchase[i] != null) {
                if (k == 1) {
                    System.out.println((i + 1) + ".");
                    System.out.print("One product with following specification: ");
                    purchase[i].description();
                    i++;
                }
                if (k != 1) {
                    System.out.println((i + 1) + " till " + (i + k));
                    System.out.println(k + " products with following specifications: ");
                    purchase[i].description();
                    i += k;
                }
            }
            if (purchase[i] == null)
                i++;

        }
    }

    //The following method adds new product to the user's cart
    public void addToCart(Product[] product, int k, int i) {
        do {
            if (m < 5) {
                this.purchase[m] = product[(k - 1)];
                //k-1 is the index of the product in the purchase array
            }
            if (m > 5) {
                System.out.println("The number of items in your cart has been exceeded...");
            }
            m++;
            i--;//i is the number of a specific product that the user wants
        } while (i > 0);

    }

    //The following method removes an item from user's cart:
    public void removeFromCart(int i) {
        this.purchase[(i - 1)] = null;
        m--;
        Product[] temp = new Product[5];
        for (int f = 0; f < 5; f++) {
            temp[f] = this.purchase[f];
            this.purchase[f] = null;
        }
        //y has been used as index of purchase array
        int y = 0;
        for (int j = 0; j < 5; j++) {
            if (temp[j] != null) {
                purchase[y] = temp[j];
                y++;
            }
        }
    }

    //The following method is the last step of submitting a purchase
    public void submit() {
        for (int i = 0; i < 5; i++) {
            if (purchase[i] != null) {
                if (this.purchase[i].getQuantity() - 1 >= 0) {
                    this.purchase[i].setQuantity((this.purchase[i].getQuantity() - 1));
                    this.purchase[i] = null;
                } else {
                    System.out.println("There aren't any product available with the following specifications: ");
                    purchase[i].description();
                    this.purchase[i] = null;
                }
            }
        }
        m = 0;
        System.out.println("Thanks for Buying...");
    }

    //The following method shows the total price of user's cart:
    public void bill() {
        for (int i = 0; i < 5; i++) {
            if (purchase[i] != null)
                totalPrice += purchase[i].getPrice();
        }
        System.out.println("The total price of your cart is: " + totalPrice);
    }

}//end of Cart class
