package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;

public class StandardPassenger extends PassengerImpl {
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

//    Standard passenger will be able to Signup for activities if he has sufficient balance
//    And the Activity has sufficient capacity
    public void signUpForActivity(Activity activity) {
        if (getBalance() >= activity.getCost()) {
            super.signUpForActivity(activity);
            deductBalance(activity.getCost());
        } else {
            System.out.println("Cannot sign up for " + activity.getName() + ". Insufficient balance.");
        }
    }
}
