package com.example.nymbleassignment;

import com.example.nymbleassignment.Passenger.PassengerImpl;
import lombok.Data;

import java.util.List;
import java.util.ArrayList;

@Data
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<PassengerImpl> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(PassengerImpl passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add passenger. Travel package is full.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            destination.printActivities();
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (PassengerImpl passenger : passengers) {
            System.out.println("Passenger: " + passenger.getName() + " (Number: " + passenger.getPassengerNumber() + ")");
        }
    }
    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacity() > 0) {
                    System.out.println("- " + activity.getName() + " at " + destination.getName() +
                            " (Spaces Available: " + activity.getCapacity() + ")");
                }
            }
        }
    }

}
