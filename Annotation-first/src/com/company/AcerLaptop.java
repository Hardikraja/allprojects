package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AcerLaptop implements Laptop {

    @Autowired
    @Qualifier("lenovoHdd")
    private Spec theSpec;

    @Override
    public String getLappy() {
        return "Acer Laptop";
    }

    @Override
    public String getHdd() {
        return theSpec.getHdd();
    }
}
