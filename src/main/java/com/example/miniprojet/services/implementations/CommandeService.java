package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Commande;
import com.example.miniprojet.repositories.CommandeRepository;
import com.example.miniprojet.services.interfaces.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService implements ICommandeService {

    CommandeRepository commandeRepository;
    @Autowired
    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

}
