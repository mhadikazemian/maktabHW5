package com.maktab.HW5.Q1;

import java.util.Scanner;

public class OnlineStore {
    Product product;
    Scanner scanner = new Scanner(System.in);
    private User user;
    private List list;

    public void userSignUp() {
        User user = new User();
        this.user = user;
        System.out.println("Enter your username: ");
        user.setUserName(scanner.nextLine());
        System.out.println("Enter your password: ");
        user.setPassword(scanner.nextInt());
        System.out.println("Enter your first name: ");
        user.setFirstName(scanner.nextLine());
        System.out.println("Enter your last name: ");
        user.setLastName(scanner.nextLine());
        System.out.println("Enter your cellphone number: ");
        user.setCellNumber(scanner.next());
        System.out.println("Enter your Email address: ");
        user.setEmail(scanner.next());
        user.insertAddress();

    }
}
