package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> findAll();
    Produit findById(Long Id);
    Produit save(Produit produit);
    void deleteById(Long Id);
    Produit updateProduct(Produit produit, Long Id);
}
