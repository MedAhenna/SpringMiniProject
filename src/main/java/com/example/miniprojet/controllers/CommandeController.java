package com.example.miniprojet.controllers;

import com.example.miniprojet.entities.Commande;
import com.example.miniprojet.services.interfaces.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/Commande")
public class CommandeController {
    private final ICommandeService commandeService;

    @Autowired
    public CommandeController(ICommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping({"","/"})
    public List<Commande> getCommande(){
        return commandeService.findAll();
    }

    @GetMapping("/{id}")
    public Commande getCommande(@PathVariable Long id){
        return commandeService.findById(id);
    }

    @DeleteMapping("{id}")
    public String deleteCommande(@PathVariable Long id){
        commandeService.deleteById(id);
        return String.format("Commande with Id : %s is deleted! ", id);
    }
    @PostMapping({"","/"})
    public Commande createCommande(@RequestBody Commande commande){
        Date datenow = new Date();
        datenow.getTime();
        commande.setDateCreated(datenow);
        return commandeService.saveCommande(commande);
    }
    @PutMapping("/{id}")
    public Commande updateCommande(@PathVariable Long id, @RequestBody Commande commande){
        return  commandeService.updateCommandeStatus(commande, id);
    }
}
