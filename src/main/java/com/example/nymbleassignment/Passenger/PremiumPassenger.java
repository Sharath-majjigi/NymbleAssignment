package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;

public class PremiumPassenger extends PassengerImpl {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, 0);
    }

    // Premium passengers can sign up for activities free
    //And also there will be no balance deduction for PremiumPassenger
    public void signUpForActivity(Activity activity) {
        super.signUpForActivity(activity);
    }
}

