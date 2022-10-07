package com.zssn.zssn.controller;

import com.zssn.zssn.Repo.InventoryRepo;
import com.zssn.zssn.Repo.SurvivorRepo;
import com.zssn.zssn.models.Inventory;
import com.zssn.zssn.models.Survivor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Formatter;
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
    @PutMapping(value="/updateSurvivorLocation/{id}")
    public String saveSurvivor(@PathVariable long id,@RequestBody Survivor survivor){
        Survivor updatedSurvivor = survivorRepo.findById(id).get();
        updatedSurvivor.setLocationX(survivor.getLocationX());
        updatedSurvivor.setLocationY(survivor.getLocationY());
        survivorRepo.save(updatedSurvivor);
        return "Successfully updated survivor!";
    }

    @GetMapping(value="/totalSurvivors")
    public long countSurvivors(){
        long count = survivorRepo.count();
        return count;
    }
    @GetMapping(value="/infectedSurvivorsCount")
    public long countInfectedSurvivors(){
        long count = survivorRepo.countByInfected(true);//table stores in bit format
        return count;
    }
    @GetMapping(value="/nonInfectedSurvivorsCount")
    public long countNonInfectedSurvivors(){
        long count = survivorRepo.countByInfected(false);//table stores in bit format
        return count;
    }
    @GetMapping("/infectedPercentage")
    public String getInfectedPercentage(){
        double infectedRatio= ((double)countInfectedSurvivors()/(double)countSurvivors())*100;
        Formatter formatter = new Formatter();
        return formatter.format("%.2f", infectedRatio)+"%";
    }
    @GetMapping("/nonInfectedPercentage")
    public String getNonInfectedPercentage(){
        double infectedRatio= ((double)countNonInfectedSurvivors()/(double)countSurvivors())*100;
        Formatter formatter = new Formatter();
        return formatter.format("%.2f", infectedRatio)+"%";
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
