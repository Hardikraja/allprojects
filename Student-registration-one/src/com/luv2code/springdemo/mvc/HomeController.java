package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getPage(){
        return "main-page";
    }

    @RequestMapping("/totheform")
    public String getRegistrationForm(Model theModel)
    {
        Student theStudent  = new Student();

        theModel.addAttribute("student",theStudent);
        return "reg-page";
    }

    @RequestMapping("/processForm")
    public String getShowPage(@ModelAttribute("student") Student theStudent){
        return "last-page";
    }
}
