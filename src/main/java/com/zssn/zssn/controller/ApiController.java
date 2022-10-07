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
    @PutMapping(value="/updateSurvivor/{id}")
    public String saveSurvivor(long id,@RequestBody Survivor survivor){
        Survivor updatedSurvivor = survivorRepo.findById(id).get();
        updatedSurvivor.setName(survivor.getName());
        updatedSurvivor.setAge(survivor.getAge());
        updatedSurvivor.setGender(survivor.getGender());
        updatedSurvivor.setInfected(survivor.isInfected());
        return "Successfully updated survivor!";
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
    @GetMapping(value="/totalSurvivors")
    public long countSurvivors(){
        long count = survivorRepo.count();
        return count;
    }
    @GetMapping(value="/infectedSurvivors")
    public long countInfectedSurvivors(){
        long count = survivorRepo.countByInfected(true);//table stores in bit format
        return count;
    }
    @GetMapping("/infectedPercentage")
    public String getInfectedPercentage(){
        double infectedRatio= ((double)countInfectedSurvivors()/(double)countSurvivors())*100;

        Formatter formatter = new Formatter();
        formatter.format("%.2f", infectedRatio);
        return infectedRatio+"%";
    }


}
