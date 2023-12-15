package com.example.nymbleassignment;

import com.example.nymbleassignment.Passenger.PassengerImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Europe Trip", 10);
        Destination destination = new Destination("Paris");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getItinerary().size());
    }

    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Asia Adventure", 5);
        PassengerImpl passenger = new PassengerImpl("John", 1, 1000);
        travelPackage.addPassenger(passenger);
        assertEquals(1, travelPackage.getPassengers().size());
    }

    @Test
    public void testAddPassengerInSufficientCapacity() {
        TravelPackage travelPackage = new TravelPackage("Asia Adventure", 0);
        PassengerImpl passenger = new PassengerImpl("John", 1, 1000);
        travelPackage.addPassenger(passenger);
        assertEquals(0, travelPackage.getPassengers().size());
    }
}

