package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Commande;
import com.example.miniprojet.services.interfaces.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Date;


@RestController
@RequestMapping("/Commande")
public class CommandeController {
    private final ICommandeService commandeService;

    @Autowired
    public CommandeController(ICommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @PostMapping({"","/"})
    public Commande createCommande(@RequestBody Commande commande){
        Date datenow = new Date();
        datenow.getTime();
        commande.setDateCreated();
        return commandeService.saveCommande(commande);
    }
}
