package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Laptop myLaptop = context.getBean("dellLaptop",Laptop.class);

        System.out.println(myLaptop.getLappy());
        System.out.println(myLaptop.getHddSpec());
        context.close();
    }
}
