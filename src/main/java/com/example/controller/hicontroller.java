package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class hicontroller {
    @GetMapping("/")
    public String sayhi(){
        return "林晓彤我在学习";
    }
}
