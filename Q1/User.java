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

    //getters and setters:
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Address getAddress() {
        return address;
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
