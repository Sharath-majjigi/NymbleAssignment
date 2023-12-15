package com.example.nymbleassignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Enjoy surfing in the waves", 50.0, 10, destination);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
    }

    @Test
    public void testGetAvailableActivities() {
        Destination destination = new Destination("Alps");
        Activity activity1 = new Activity("Skiing", "Ski down the snowy slopes", 80.0, 5, destination);
        Activity activity2 = new Activity("Snowboarding", "Ride the snow-covered mountains", 70.0, 0, destination);
        destination.addActivity(activity1);
        destination.addActivity(activity2);
        assertEquals(1, destination.getAvailableActivities().size());
    }
}
