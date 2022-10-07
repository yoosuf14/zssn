package com.zssn.zssn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String getPage(){
        return "<h1>Welcome to Zombie Survival Social Network!<h1>";
    }

}
