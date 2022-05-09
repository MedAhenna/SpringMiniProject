package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Cooperative;
import com.example.miniprojet.entities.Produit;
import com.example.miniprojet.services.interfaces.ICooperativeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Cooperative")
public class CooperativeController {
    private final ICooperativeService cooperativeService;

    public CooperativeController(ICooperativeService cooperativeService) {
        this.cooperativeService = cooperativeService;
    }

    @GetMapping({"","/"})
    public List<Cooperative> getCooperatives(){
        return cooperativeService.findAll();
    }

    @GetMapping("/{id}")
    public Cooperative getCooperative(@PathVariable Long id){
        return cooperativeService.findById(id);
    }

    @PostMapping({"","/"})
    public Cooperative addCooperative(@RequestBody Cooperative cooperative){
        return cooperativeService.save(cooperative);
    }

    @DeleteMapping("/{id}")
    public void deleteCooperative(@PathVariable Long id){
        cooperativeService.deleteById(id);
    }
}
