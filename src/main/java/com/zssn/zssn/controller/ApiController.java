package com.zssn.zssn.controller;

import com.zssn.zssn.Repo.InventoryRepo;
import com.zssn.zssn.Repo.SurvivorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private SurvivorRepo survivorRepo;
    @Autowired
    private InventoryRepo inventoryRepo;
    @GetMapping("/")
    public String getPage(){
        return "<h1>Welcome to Zombie Survival Social Network!<h1>";
    }

}
