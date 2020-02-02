package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainerMain {
    public static void main(String[] args) {
        // set Configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // create bean
        AiTrainer myTrainer = context.getBean("myTrainerAi",AiTrainer.class);

        // use bean
        System.out.println(myTrainer.getDailyHomework());

        // use injected method
        System.out.println(myTrainer.getDailyService());

        // get values
        System.out.println(myTrainer.getEmail());
        System.out.println(myTrainer.getName());

        // close context
        context.close();

    }
}
