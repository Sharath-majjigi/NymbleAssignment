package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;

//Passenger can have 3 different types
//1. Standard Passenger
//2. Gold Passenger
//3. Premium Passenger
// So they all have different logic for signing up to activities that is the reason we have an interface
//and let all those classes implement the methods
public interface Passenger {
    void signUpForActivity(Activity activity);
    void printDetails();
    void deductBalance(double amount);
}
