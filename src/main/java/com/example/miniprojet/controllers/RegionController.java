package com.example.miniprojet.controllers;


import com.example.miniprojet.entities.Categorie;
import com.example.miniprojet.entities.Region;
import com.example.miniprojet.services.interfaces.ICategorieService;
import com.example.miniprojet.services.interfaces.IRegionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionController {

    private final IRegionService regionService;

    public RegionController(IRegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("/regions")
    public List<Region> getRegions(){
        return regionService.findAll();
    }

    @GetMapping("/region/{id}")
    public Region getRegion(@PathVariable Long id){
        return regionService.findById(id);
    }

    @PostMapping("/region/save")
    public Region addRegion(@RequestBody Region region){
        return regionService.save(region);
    }

    @DeleteMapping("/region/{id}")
    public void deleteRegion(@PathVariable Long id){
        regionService.deleteById(id);
    }
}
