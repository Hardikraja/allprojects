package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KabaddiCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "do some heavy exercise everyday";
    }

    @Override
    public String getDailyFortune() {
         return fortuneService.getDailyFortune();
    }
}
