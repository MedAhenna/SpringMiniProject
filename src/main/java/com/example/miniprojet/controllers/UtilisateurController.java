package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Administrateur;
import com.example.miniprojet.entities.Utilisateur;
import com.example.miniprojet.services.interfaces.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UtilisateurController {

    private final IUtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(IUtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("all")
    List<Utilisateur> getUsers(){
        return utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    Utilisateur getUser(@PathVariable Long id){
        return utilisateurService.findById(id);
    }

    @PostMapping("admin")
    Utilisateur addAdmin(@RequestBody Administrateur admin){
        return utilisateurService.save(admin);
    }


}
