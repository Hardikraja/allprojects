package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Spec lenovoHdd(){
        return new LenovoHdd();
    }

    @Bean
    public Laptop dellLaptop(){
        DellLaptop dlaptop = new DellLaptop(lenovoHdd());
        return dlaptop;
    }

    @Bean
    public Laptop lenovoLaptop(){
        LenovoLaptop llaptop = new LenovoLaptop(lenovoHdd());
        return llaptop;
    }


}
