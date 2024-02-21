package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutPageController {

    @GetMapping("/aboutpage")
    public String getAboutPage(){
        return "aboutpage";
    }
}
