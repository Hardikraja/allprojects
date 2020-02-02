package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    //it's an example of Constructor injection
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortune){
        fortuneService=theFortune;
    }



    @Override
    public String getDailyWorkout() {
        return "Do workout after match for 2 hrs.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
