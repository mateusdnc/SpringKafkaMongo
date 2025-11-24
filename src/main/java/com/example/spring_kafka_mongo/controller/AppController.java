package com.example.spring_kafka_mongo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AppController {

    @GetMapping
    @ResponseBody
    public String homePage(){
        return "Hello world!";
    }
    
}
