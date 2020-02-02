package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

    private FortuneService theFortune;
    //it's an example of method autowiring injection

    @Autowired
    @Qualifier("happyFortuneService")
    public void doSomeCrazyStuff(FortuneService theFortune) {
        this.theFortune=theFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Play football for 4 hrs daily";
    }

    @Override
    public String getDailyFortune() {
        return theFortune.getFortune();
    }
}
