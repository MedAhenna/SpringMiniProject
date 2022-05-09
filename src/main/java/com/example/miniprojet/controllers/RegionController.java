package com.example.miniprojet.controllers;


import com.example.miniprojet.entities.Categorie;
import com.example.miniprojet.entities.Region;
import com.example.miniprojet.services.interfaces.ICategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {

    private final IRegionService regionService;

    public RegionController(IRegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping({"","/"})
    public List<Region> getRegions(){
        return regionService.findAll();
    }

    @GetMapping("/{id}")
    public Region getRegion(@PathVariable Long id){
        return regionService.findById(id);
    }

    @PostMapping({"","/"})
    public Region addRegion(@RequestBody Region region){
        return regionService.save(region);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Long id){
        regionService.deleteById(id);
    }
}
