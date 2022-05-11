package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.MatierePremiere;
import com.example.miniprojet.services.interfaces.IMatierePremiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MatierePremiereController {

    private final IMatierePremiereService matierePremiereService;

    public MatierePremiereController(IMatierePremiereService matierePremiereService) {
        this.matierePremiereService = matierePremiereService;
    }

    @GetMapping("matpremiers")
    public List<MatierePremiere> getMatierePremieres(){
        return matierePremiereService.findAll();
    }

    @GetMapping("/matpremier/{id}")
    public MatierePremiere getMatierePremiere(@PathVariable Long id){
        return matierePremiereService.findById(id);
    }

    @PostMapping("/matpremier/save")
    public MatierePremiere addMatierePremiere(@RequestBody MatierePremiere matierePremiere){
        return matierePremiereService.save(matierePremiere);
    }

    @DeleteMapping("/matpremier/{id}")
    public void deleteMatierePremiere(@PathVariable Long id){
        matierePremiereService.deleteById(id);
    }
}
