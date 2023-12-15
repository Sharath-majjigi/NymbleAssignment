package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;

public class GoldPassenger extends PassengerImpl {
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

//    Gold Passengers have some discount attached for their purchase for travel package.
    public void signUpForActivity(Activity activity) {
        // Applying 10% discount
        double discountedCost = activity.getCost() * 0.9;
        if (getBalance() >= discountedCost) {
            super.signUpForActivity(activity);
            deductBalance(discountedCost);
        } else {
            System.out.println("Cannot sign up for " + activity.getName() + ". Insufficient balance.");
        }
    }
}

