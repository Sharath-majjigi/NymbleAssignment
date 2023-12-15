package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//This is the base implementation class of Passenger interface which has Base implementation of
//signup activities and other common methods,since they are common to every passenger we have
// reduced redundancy of code.
@Data
public class PassengerImpl implements Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private List<Activity> signedUpActivities;

    public PassengerImpl(String name, int passengerNumber, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.signedUpActivities = new ArrayList<>();
    }

    @Override
    public void signUpForActivity(Activity activity) {
        if (activity.getCapacity() > 0) {
            signedUpActivities.add(activity);
            activity.getDestination().subtractCapacity(activity);
        } else {
            System.out.println("Cannot sign up for " + activity.getName() + ". Activity is full.");
        }
    }

//    A Method to print the details of Passenger
    @Override
    public void printDetails() {
        System.out.println("Passenger: " + name + " (Number: " + passengerNumber + ")");
        if (balance >= 0) {
            System.out.println("Balance: $" + balance);
        }

        if (!signedUpActivities.isEmpty()) {
            System.out.println("Signed Up Activities:");
            for (Activity activity : signedUpActivities) {
                System.out.println("- " + activity.getName() + " at " + activity.getDestination().getName() +
                        " (Cost: $" + activity.getCost() + ")");
            }
        } else {
            System.out.println("No activities signed up.");
        }
    }

    @Override
    public void deductBalance(double amount) {
        balance -= amount;
    }
}
