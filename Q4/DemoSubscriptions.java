package com.maktab.HW5.Q4;

public class DemoSubscriptions {
    public static void main(String[] args) {
        NewspaperSubscription[] subscription = new NewspaperSubscription[5];
        for (int i = 0; i < 5 ; i++) {
            int r = (int) (Math.random() * 2) + 1;
            if (r == 1) {
                subscription[i] = new PhysicalNewspaperSubscription();
                subscription[i].setSubscriberName("Subscriber ");
                subscription[i].setAddress(" Street");
                System.out.println("Physical Subscription: ");
                System.out.println("Subscriber Name: " + subscription[i].getSubscriberName() + (i+1));
                System.out.println("Subscription rate: " + subscription[i].getRate());
                System.out.println("Subscriber Address: " + (i+1) + subscription[i].getAddress());
                System.out.println("************************");
            }
            if (r == 2) {
                subscription[i] = new OnlineNewspaperSubscription();
                subscription[i].setSubscriberName("Subscriber ");
                subscription[i].setAddress("subscriber@add");
                System.out.println("Online Subscription: ");
                System.out.println("Subscriber Name: " + subscription[i].getSubscriberName() + (i+1));
                System.out.println("Subscription rate: " + subscription[i].getRate());
                System.out.println("Subscriber Email: " + subscription[i].getAddress() + (i+1));
                System.out.println("************************");

            }
        }


    }
}
