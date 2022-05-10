package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.MatierePremiere;
import com.example.miniprojet.services.interfaces.IMatierePremiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/matierePremiere")
public class MatierePremiereController {

    private final IMatierePremiereService matierePremiereService;

    public MatierePremiereController(IMatierePremiereService matierePremiereService) {
        this.matierePremiereService = matierePremiereService;
    }

    @GetMapping({"","/"})
    public List<MatierePremiere> getMatierePremieres(){
        return matierePremiereService.findAll();
    }

    @GetMapping("/{id}")
    public MatierePremiere getMatierePremiere(@PathVariable Long id){
        return matierePremiereService.findById(id);
    }

    @PostMapping({"","/"})
    public MatierePremiere addMatierePremiere(@RequestBody MatierePremiere matierePremiere){
        return matierePremiereService.save(matierePremiere);
    }

    @DeleteMapping("/{id}")
    public void deleteMatierePremiere(@PathVariable Long id){
        matierePremiereService.deleteById(id);
    }
}
