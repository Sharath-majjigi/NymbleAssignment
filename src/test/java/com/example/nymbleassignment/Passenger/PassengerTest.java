package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;
import com.example.nymbleassignment.Destination;
import com.example.nymbleassignment.Passenger.PassengerImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testSignUpForActivity() {
        Destination destination = new Destination("Maldives");
        Activity activity = new Activity("Snorkeling", "Explore underwater life", 40.0, 8, destination);
        PassengerImpl passenger = new PassengerImpl("Alice", 2, 500);
        passenger.signUpForActivity(activity);
        assertEquals(1, passenger.getSignedUpActivities().size());
    }

    @Test
    public void testDeductBalance() {
        PassengerImpl passenger = new PassengerImpl("Bob", 3, 200);
        passenger.deductBalance(50.0);
        assertEquals(150.0, passenger.getBalance(), 0.001);
    }

}
