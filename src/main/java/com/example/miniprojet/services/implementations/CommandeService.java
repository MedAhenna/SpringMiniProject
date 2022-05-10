package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Categorie;
import com.example.miniprojet.entities.Commande;
import com.example.miniprojet.entities.Produit;
import com.example.miniprojet.entities.Status;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.CommandeRepository;
import com.example.miniprojet.services.interfaces.ICommandeService;
import com.example.miniprojet.utils.isNullOrEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService implements ICommandeService {

    CommandeRepository commandeRepository;
    StatusService statusService;
    @Autowired
    public CommandeService(CommandeRepository commandeRepository,StatusService statusService) {
        this.commandeRepository = commandeRepository;
        this.statusService = statusService;
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande findById(Long Id) {
        return commandeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Commande","Id",Id));
    }

    @Override
    public void deleteById(Long Id) {
        commandeRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Commande","Id",Id));
        commandeRepository.deleteById(Id);
    }

    @Override
    public Commande updateCommandeStatus(Commande commande, Long Id) {
        Commande existCommande = commandeRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Commande","Id",Id)
        );
        existCommande.setStatus(isNullOrEmpty.check(commande.getStatus()) ? commande.getStatus() : existCommande.getStatus());

        commandeRepository.save(existCommande);
        return existCommande;
    }

    @Override
    public Commande UpdateCommandeStatus(Long commandeId, Long statusId) {
        Commande commande = this.findById(commandeId);
        Status status = statusService.findById(statusId);
        commande.setStatus(status);
        return commandeRepository.save(commande);
    }

}
