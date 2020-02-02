package com.company;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(){

    }
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout(){
        return "spend 30 minutes on running";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
