package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private  FortuneService fortuneService;
/*
    @Autowired
    public CricketCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }*/

    public CricketCoach(){

    }

    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run 60 km in 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
