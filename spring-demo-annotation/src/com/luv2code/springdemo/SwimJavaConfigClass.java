package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigClass {
    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //call our new methods
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        //close the context
        context.close();
    }
}
