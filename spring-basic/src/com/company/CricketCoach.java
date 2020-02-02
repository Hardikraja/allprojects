package com.company;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //Create no arg constructor
    public CricketCoach(){

    }


    public void setFortuneService(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "do some work everyday bro";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
