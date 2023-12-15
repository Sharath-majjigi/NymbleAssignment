package com.example.nymbleassignment;


import com.example.nymbleassignment.Passenger.*;


import com.example.nymbleassignment.Passenger.GoldPassenger;
import com.example.nymbleassignment.Passenger.PremiumPassenger;
import com.example.nymbleassignment.Passenger.StandardPassenger;

public class Main {
    public static void main(String[] args) {
        // Create a travel package
        TravelPackage travelPackage = createTravelPackage();

        // Add passengers to the travel package
        addPassengers(travelPackage);

        // Print itinerary
        printSectionHeader("Itinerary of the travel package");
        travelPackage.printItinerary();
        System.out.println();

        // Print passenger list
        printSectionHeader("Passenger list of the travel package");
        travelPackage.printPassengerList();
        System.out.println();

        // Perform sign-up for activities
        performActivitySignUp(travelPackage);

        // Print details after sign-up
        printSectionHeader("Details of individual passengers after sign-up");
        printPassengerDetails(travelPackage);

        // Print details of available activities
        printSectionHeader("Details of available activities");
        travelPackage.printAvailableActivities();
    }

    private static TravelPackage createTravelPackage() {
        TravelPackage travelPackage = new TravelPackage("Luxury Vacation", 20);

        // Create destinations
        Destination paris = new Destination("Paris");
        Destination maldives = new Destination("Maldives");

        // Create activities
        Activity cityTour = new Activity("City Tour", "Explore the city", 30.0, 5, paris);
        Activity scubaDiving = new Activity("Scuba Diving", "Underwater adventure", 50.0, 8, maldives);

        // Add activities to destinations
        paris.addActivity(cityTour);
        maldives.addActivity(scubaDiving);

        // Add destinations to the travel package
        travelPackage.addDestination(paris);
        travelPackage.addDestination(maldives);

        return travelPackage;
    }

    private static void addPassengers(TravelPackage travelPackage) {
        // Create passengers
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        GoldPassenger goldPassenger = new GoldPassenger("Bob", 2, 150.0);
        PremiumPassenger premiumPassenger = new PremiumPassenger("Eve", 3);

        // Add passengers to the travel package
        travelPackage.addPassenger(standardPassenger);
        travelPackage.addPassenger(goldPassenger);
        travelPackage.addPassenger(premiumPassenger);
    }

    private static void performActivitySignUp(TravelPackage travelPackage) {
        // Perform sign-up for activities
        StandardPassenger standardPassenger = (StandardPassenger) travelPackage.getPassengers().get(0);
        GoldPassenger goldPassenger = (GoldPassenger) travelPackage.getPassengers().get(1);
        PremiumPassenger premiumPassenger = (PremiumPassenger) travelPackage.getPassengers().get(2);
//        PremiumPassenger premiumPassenger1 = (PremiumPassenger) travelPackage.getPassengers().get(2);

//        premiumPassenger1.signUpForActivity(travelPackage.getItinerary().get(0).getActivities().get(0));
        standardPassenger.signUpForActivity(travelPackage.getItinerary().get(0).getActivities().get(0));
        goldPassenger.signUpForActivity(travelPackage.getItinerary().get(1).getActivities().get(0));
        premiumPassenger.signUpForActivity(travelPackage.getItinerary().get(0).getActivities().get(0));
    }

    private static void printPassengerDetails(TravelPackage travelPackage) {
        for (Passenger passenger : travelPackage.getPassengers()) {
            passenger.printDetails();
            System.out.println();
        }
    }

    private static void printSectionHeader(String header) {
        System.out.println("----------------- " + header + " ----------------------");
    }
}



