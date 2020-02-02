package com.company;

import org.springframework.stereotype.Component;

@Component
public class SeagateHdd implements Spec {
    @Override
    public String getHdd() {
        return "seagate Hdd";
    }
}
