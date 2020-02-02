package com.company;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "practice 30 times a day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
