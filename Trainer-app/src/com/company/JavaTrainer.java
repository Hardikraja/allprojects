package com.company;

public class JavaTrainer implements Trainer {

    private Service myService;

    public JavaTrainer(Service theService){
        myService=theService;
    }

    @Override
    public String getDailyHomework() {
        return "practice Multi-threading in java for 1 hour...";
    }

    @Override
    public String getDailyService() {
        return myService.getServiceDesc();
    }
}
