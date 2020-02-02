package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load the spring configuration files
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("cricketCoach",Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // Fortune service
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();

    }
}
