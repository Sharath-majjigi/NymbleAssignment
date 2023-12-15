package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;
import com.example.nymbleassignment.Destination;
import org.junit.Test;
import static org.junit.Assert.*;

public class GoldPassengerTest {

    @Test
    public void testSignUpForActivityWithSufficientBalance() {
        GoldPassenger goldPassenger = new GoldPassenger("Bob", 3, 150.0);
        Activity activity = new Activity("Scuba Diving", "Underwater adventure", 50.0, 8, new Destination("Maldives"));

        goldPassenger.signUpForActivity(activity);

        assertEquals(105.0, goldPassenger.getBalance(), 0.01);
        assertEquals(1, goldPassenger.getSignedUpActivities().size());
    }

    @Test
    public void testSignUpForActivityWithInsufficientBalance() {
        GoldPassenger goldPassenger = new GoldPassenger("Charlie", 4, 40.0);
        Activity expensiveActivity = new Activity("Private Yacht Tour", "Luxury experience", 500.0, 2, new Destination("Caribbean"));

        goldPassenger.signUpForActivity(expensiveActivity);

        assertEquals(40.0, goldPassenger.getBalance(), 0.01);
        assertEquals(0, goldPassenger.getSignedUpActivities().size());
    }

}

