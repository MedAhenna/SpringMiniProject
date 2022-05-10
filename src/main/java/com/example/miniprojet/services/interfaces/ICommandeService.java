package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Commande;
import com.example.miniprojet.entities.Produit;

import java.util.List;

public interface ICommandeService {
    Commande saveCommande(Commande coMmande);
    List<Commande> findAll();
    Commande findById(Long Id);
    void deleteById(Long Id);
    Commande updateCommandeStatus(Commande commande, Long Id);
    Commande UpdateCommandeStatus(Long commandeId, Long statusId);

}
