package com.maktab.HW5.Q1;

import java.util.Scanner;

public class OnlineStore {

    Scanner scanner = new Scanner(System.in);

    //OnlineStore variables:
    private User user;
    private List list;

    //The following method gets user's information:
    public void userSignUp() {
        User user = new User();
        this.user = user;
        System.out.println("Enter your username: ");
        user.setUserName(scanner.nextLine());
        System.out.println("Enter your password: ");
        user.setPassword(scanner.nextLine());
        System.out.println("Enter your first name: ");
        user.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name: ");
        user.setLastName(scanner.nextLine());
        System.out.println("Enter your cellphone number: ");
        user.setCellNumber(scanner.next());
        System.out.println("Enter your Email address: ");
        user.setEmail(scanner.next());
        user.insertAddress();
        System.out.println("You've successfully signed up...");
    }//end of userSignUp class

    //The following method makes a list of every product that is available at the online store:
    public void setList(Product[] products) {
        list.list(products);
    }

}//end of OnlineStore class
