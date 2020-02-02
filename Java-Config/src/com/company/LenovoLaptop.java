package com.company;

import org.springframework.stereotype.Component;

@Component
public class LenovoLaptop implements Laptop{

    private Spec theSpec;

    public LenovoLaptop(Spec spec){
        theSpec=spec;
    }

    @Override
    public String getLappy() {
        return "I am lenovo laptop";
    }

    @Override
    public String getHddSpec() {
        return theSpec.getHdd();
    }
}
