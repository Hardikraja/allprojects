package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.tags.EditorAwareTag;

import java.util.Random;

@Component
public class RandomService implements FortuneService {

    //array of Strings
    private String[] fortunearray =
            {"Beware of the wolf in sheep's clothing",
              "Why fight !! when we can negotiate",
               "the world is yours!!"};

    private Random myRandom = new Random();

    @Override
    public String getFortune(){

        //pick a random string from the array

        int index = myRandom.nextInt(fortunearray.length);

        return fortunearray[index];
    }
}
