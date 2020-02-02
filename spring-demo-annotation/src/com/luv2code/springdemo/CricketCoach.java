package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private FortuneService theFortuneService;

    //it's an example of setter injection

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService theFortune){
        theFortuneService = theFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "hit six sixes everyday";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}
