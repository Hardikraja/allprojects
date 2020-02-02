package com.company;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Have a nice day !";
    }
}
