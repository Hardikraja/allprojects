package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;


    public CricketCoach(){
        System.out.println("CricketCoach : inside no-arg constructor");
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "hit 23 sixes everydate";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
