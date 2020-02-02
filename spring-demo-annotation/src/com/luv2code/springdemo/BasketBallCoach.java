package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

    @Autowired
    @Qualifier("randomService")
    private FortuneService theFortune;

    @Override
    public String getDailyWorkout() {
        return "play basket ball for 4 hours daily";
    }

    @Override
    public String getDailyFortune() {
        return theFortune.getFortune();
    }
}
