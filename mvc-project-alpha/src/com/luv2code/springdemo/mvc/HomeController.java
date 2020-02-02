package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getPageName(){
        return "main-page";
    }

    @RequestMapping("/regform")
    public String getRegForm(Model theModel){
        theModel.addAttribute("student",new Student());
        return "reg-form";
    }

    @RequestMapping("/show-detail")
    public String getProcessedForm(@ModelAttribute("student1") Student theStudent){
        return "processed-form";
    }

}
