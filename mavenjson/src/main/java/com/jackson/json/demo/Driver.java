package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try{

            // create object mapper
            ObjectMapper mapper = new ObjectMapper();
            //read json file and convert to java pojo : data/sample-lite.json
            Student theStudent = mapper.readValue(new File("data/sample-lite.json"),Student.class);
            // print first name and last name
            System.out.println(theStudent.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
