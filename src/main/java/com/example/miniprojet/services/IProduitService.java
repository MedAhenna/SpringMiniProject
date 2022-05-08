package com.example.miniprojet.services;

import com.example.miniprojet.entities.Produit;

import java.util.List;
import java.util.Optional;

public interface IProduitService {
    public List<Produit> findAll();
    public Produit findById(Long Id);
    public Produit save(Produit produit);
    void deleteById(Long Id);
    public Produit updateProduct(Produit produit,Long Id);
}
