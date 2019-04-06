package com.maktab.HW5.Q1;

import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);

    /*User class variables: */
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String cellNumber;
    private String Email;
    private Address address;

    //setters:

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }


    public void setEmail(String email) {
        Email = email;
    }
    

    //method for inserting address by user
    public void insertAddress() {
        Address address = new Address();
        this.address = address;
        System.out.println("Please insert your state: ");
        address.setState(scanner.next());
        System.out.println("Please insert your city: ");
        address.setCity(scanner.next());
        System.out.println("Please insert your street: ");
        address.setStreet(scanner.next());
        System.out.println("Please insert your ZIP Code: ");
        address.setZIPCode(scanner.next());
    }
}//end of User class
