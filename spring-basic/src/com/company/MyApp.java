package com.company;

public class MyApp {
    public static void main(String[] args) {
        //create the object of baseballcoach
        Coach theCoach = new TrackCoach();
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
