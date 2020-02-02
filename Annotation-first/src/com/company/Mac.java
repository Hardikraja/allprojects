package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mac implements Laptop {

    private Spec theSpec;


    @Autowired
    @Qualifier("lenovoHdd")
    public void setTheSpec(Spec spec){
        theSpec=spec;
    }


    @Override
    public String getLappy() {
        return "I am mac";
    }

    @Override
    public String getHdd() {
        return theSpec.getHdd();
    }
}
