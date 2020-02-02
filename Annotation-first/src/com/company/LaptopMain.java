package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Laptop myLaptop = context.getBean("acerLaptop", Laptop.class);

        System.out.println(myLaptop.getLappy());
        System.out.println(myLaptop.getHdd());
        context.close();
    }
}
