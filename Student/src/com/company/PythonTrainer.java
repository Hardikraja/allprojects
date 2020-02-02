package com.company;

public class PythonTrainer implements Trainer {

    private FortuneService fortuneService;


    public PythonTrainer(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getTrainingInfo() {
        return "Learn it from telusko";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
