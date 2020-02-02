package com.company;

import org.springframework.stereotype.Component;


public class DellLaptop implements Laptop {

    private Spec theSpec;

    public DellLaptop(Spec spec){
        theSpec=spec;
    }

    @Override
    public String getLappy() {
        return "i am dell laptop";
    }

    @Override
    public String getHddSpec() {
        return theSpec.getHdd();
    }
}
