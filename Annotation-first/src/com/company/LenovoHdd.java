package com.company;

import org.springframework.stereotype.Component;

@Component
public class LenovoHdd implements Spec {
    @Override
    public String getHdd() {
        return "lenovo hdd";
    }
}
