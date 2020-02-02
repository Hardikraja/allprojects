package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainerMain {
    public static void main(String[] args) {
        // load the spring container class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Trainer myTrainer = context.getBean("myTrainer",Trainer.class);
        // use methods of bean
        System.out.println(myTrainer.getTrainingInfo());
        // use fortune method
        System.out.println(myTrainer.getFortune());
        //close bean
        context.close();
    }
}
