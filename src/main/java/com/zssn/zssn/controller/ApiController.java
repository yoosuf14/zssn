package com.zssn.zssn.controller;

import com.zssn.zssn.Repo.InventoryRepo;
import com.zssn.zssn.Repo.SurvivorRepo;
import com.zssn.zssn.models.Inventory;
import com.zssn.zssn.models.Survivor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private SurvivorRepo survivorRepo;
    @Autowired
    private InventoryRepo inventoryRepo;
    @GetMapping(value="/")
    public String getPage(){
        return "<h1>Welcome to Zombie Survival Social Network!<h1>";
    }

    @GetMapping(value="/allSurvivors")
    public List<Survivor> getSurvivors(){
        return survivorRepo.findAll();
    }
    @PostMapping(value="/registerSurvivor")
    public String saveSurvivor(@RequestBody Survivor survivor){
        survivorRepo.save(survivor);
        return "Successfully registered survivor!";
    }

    @GetMapping(value="/allInventory")
    public List<Inventory> getInventory(){
        return inventoryRepo.findAll();
    }
    @PostMapping(value="/createInventory")
    public String saveSurvivor(@RequestBody Inventory inventory){
        inventoryRepo.save(inventory);
        return "Successfully created inventory!";
    }



}
