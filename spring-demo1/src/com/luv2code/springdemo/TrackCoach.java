package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService theFortune;

    public TrackCoach(FortuneService thef)
    {
        theFortune=thef;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 kmm";
    }

    @Override
    public String getDailyFortune() {
        return theFortune.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method domy Stuff");
    }

    public void coMyCleanupStuff(){
        System.out.println("TrackCoach: destroy method");
    }
}
