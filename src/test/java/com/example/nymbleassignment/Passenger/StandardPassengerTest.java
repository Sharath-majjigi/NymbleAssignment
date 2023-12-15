package com.example.nymbleassignment.Passenger;

import com.example.nymbleassignment.Activity;
import com.example.nymbleassignment.Destination;
import org.junit.Test;
import static org.junit.Assert.*;

public class StandardPassengerTest {

    @Test
    public void testSignUpForActivityWithSufficientBalance() {
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = new Activity("Sightseeing", "City tour", 30.0, 5, new Destination("Paris"));

        standardPassenger.signUpForActivity(activity);

        assertEquals(70.0, standardPassenger.getBalance(), 0.01);
        assertEquals(1, standardPassenger.getSignedUpActivities().size());
    }

    @Test
    public void testSignUpForActivityWithInsufficientBalance() {
        StandardPassenger standardPassenger = new StandardPassenger("Alice", 2, 20.0);
        Activity expensiveActivity = new Activity("Helicopter Tour", "Aerial view", 200.0, 3, new Destination("New York"));

        standardPassenger.signUpForActivity(expensiveActivity);

        assertEquals(20.0, standardPassenger.getBalance(), 0.01);
        assertEquals(0, standardPassenger.getSignedUpActivities().size());
    }
}

