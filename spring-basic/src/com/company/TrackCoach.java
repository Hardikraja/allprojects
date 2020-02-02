package com.company;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    public TrackCoach(){

    }

    @Override
    public String getDailyWorkout() {
        return "Drink 2-3 liter water daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
