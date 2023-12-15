package com.example.nymbleassignment;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;


    public void subtractCapacity() {
        if (capacity > 0) {
            capacity--;
        }
    }
}
