package com.example.miniprojet.controllers;

import com.example.miniprojet.dto.CommandeStatusDTO;
import com.example.miniprojet.entities.Commande;
import com.example.miniprojet.services.interfaces.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CommandeController {
    private final ICommandeService commandeService;

    @Autowired
    public CommandeController(ICommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("/commandes")
    public List<Commande> getCommandes(){
        return commandeService.findAll();
    }

    @GetMapping("/commande/{id}")
    public Commande getCommande(@PathVariable Long id){
        return commandeService.findById(id);
    }

    @DeleteMapping("/commande/{id}")
    public String deleteCommande(@PathVariable Long id){
        commandeService.deleteById(id);
        return String.format("Commande with Id : %s is deleted! ", id);
    }
    @PostMapping("/commande/save")
    public Commande createCommande(@RequestBody Commande commande){
        Date datenow = new Date();
        commande.setDateCreated(datenow);
        return commandeService.saveCommande(commande);
    }
    @PutMapping("/commande/{id}")
    public Commande updateCommande(@PathVariable Long id, @RequestBody Commande commande){
        return  commandeService.updateCommandeStatus(commande, id);
    }
    @PostMapping("/commandestatus")
    public Commande commandestatus(@RequestBody CommandeStatusDTO CommandeDto) {
        System.out.println(CommandeDto.getCommandeId());
        System.out.println(CommandeDto.getStatusId());
        return commandeService.UpdateCommandeStatus(CommandeDto.getCommandeId(),CommandeDto.getStatusId());
    }

}
