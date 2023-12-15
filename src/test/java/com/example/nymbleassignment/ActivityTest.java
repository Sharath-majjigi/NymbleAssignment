package com.example.nymbleassignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void testActivityAssociatedWithOneDestination() {
        Destination destination1 = new Destination("City A");
        Destination destination2 = new Destination("City B");

        Activity activity = new Activity("City Tour", "Explore the city", 30.0, 10, destination1);

        assertEquals(destination1, activity.getDestination());

        // Attempt to associate the activity with another destination
        activity.setDestination(destination2);

        // Now, the destination should be the second destination
        assertEquals(destination2, activity.getDestination());
    }

    @Test
    public void testGetName() {
        Destination destination = new Destination("Tokyo");
        Activity activity = new Activity("City Tour", "Explore the city", 30.0, 15, destination);
        assertEquals("City Tour", activity.getName());
    }

    @Test
    public void testGetCost() {
        Destination destination = new Destination("New York");
        Activity activity = new Activity("Broadway Show", "Watch a famous Broadway show", 100.0, 20, destination);
        assertEquals(100.0, activity.getCost(), 0.001);
    }

    @Test
    public void testGetCapacity() {
        Destination destination = new Destination("Sydney");
        Activity activity = new Activity("Harbor Cruise", "Enjoy a cruise in the harbor", 60.0, 25, destination);
        assertEquals(25, activity.getCapacity());
    }
    @Test
    public void testGetDestination() {
        Destination destination = new Destination("Tokyo");
        Activity activity = new Activity("City Tour", "Explore the city", 30.0, 15, destination);
        assertEquals("Tokyo", destination.getName());
    }
}

