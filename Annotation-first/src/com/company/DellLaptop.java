package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DellLaptop implements Laptop {

    private Spec theSpec;

    @Autowired
    public DellLaptop(@Qualifier("lenovoHdd") Spec spec){
        theSpec=spec;
    }

    @Override
    public String getLappy() {
        return "I am dell";
    }

    @Override
    public String getHdd() {
        return theSpec.getHdd();
    }
}
