package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.SecteurActivite;
import com.example.miniprojet.services.interfaces.ISecteurActiviteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SecteurActiviteController {
    private final ISecteurActiviteService secteurActiviteService;

    public SecteurActiviteController(ISecteurActiviteService secteurActiviteService) {
        this.secteurActiviteService = secteurActiviteService;
    }

    @GetMapping("/secteuractivites")
    public List<SecteurActivite> getSecteurActivites(){
        return secteurActiviteService.findAll();
    }

    @GetMapping("/secteuractivites/{id}")
    public SecteurActivite getSecteurActivite(@PathVariable Long id){
        return secteurActiviteService.findById(id);
    }

    @PostMapping("/secteuractivites/save")
    public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite secteurActivite){
        return secteurActiviteService.save(secteurActivite);
    }

    @DeleteMapping("/secteuractivites/{id}")
    public void deleteSecteurActivite(@PathVariable Long id){
        secteurActiviteService.deleteById(id);
    }
}
