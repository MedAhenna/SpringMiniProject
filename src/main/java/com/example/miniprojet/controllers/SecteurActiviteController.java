package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.SecteurActivite;
import com.example.miniprojet.services.interfaces.ISecteurActiviteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/secteurActivite")
public class SecteurActiviteController {
    private final ISecteurActiviteService secteurActiviteService;

    public SecteurActiviteController(ISecteurActiviteService secteurActiviteService) {
        this.secteurActiviteService = secteurActiviteService;
    }

    @GetMapping({"","/"})
    public List<SecteurActivite> getSecteurActivites(){
        return secteurActiviteService.findAll();
    }

    @GetMapping("/{id}")
    public SecteurActivite getSecteurActivite(@PathVariable Long id){
        return secteurActiviteService.findById(id);
    }

    @PostMapping({"","/"})
    public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite secteurActivite){
        return secteurActiviteService.save(secteurActivite);
    }

    @DeleteMapping("/{id}")
    public void deleteSecteurActivite(@PathVariable Long id){
        secteurActiviteService.deleteById(id);
    }
}
