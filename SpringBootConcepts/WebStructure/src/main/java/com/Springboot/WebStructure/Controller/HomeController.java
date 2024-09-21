package com.Springboot.WebStructure.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "Welcome to Home page";
    }
    @RequestMapping("/about")
    public String about(){
        return "This is about Page";
    }
}
