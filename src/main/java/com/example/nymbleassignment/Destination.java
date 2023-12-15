package com.example.nymbleassignment;

import lombok.Data;

import java.util.List;
import java.util.ArrayList;


@Data
public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public List<Activity> getAvailableActivities() {
        List<Activity> availableActivities = new ArrayList<>();
        for (Activity activity : activities) {
            if (activity.getCapacity() > 0) {
                availableActivities.add(activity);
            }
        }
        return availableActivities;
    }


    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void subtractCapacity(Activity activity) {
        Activity targetActivity = findActivity(activity.getName());
        if (targetActivity != null && targetActivity.getCapacity() > 0) {
            targetActivity.subtractCapacity();
        }
    }

    private Activity findActivity(String activityName) {
        for (Activity activity : activities) {
            if (activity.getName().equals(activityName)) {
                return activity;
            }
        }
        return null;
    }
    public void printActivities() {
        System.out.println("Activities at " + name + ":");
        for (Activity activity : activities) {
            System.out.println("  - " + activity.getName());
        }
    }
}

