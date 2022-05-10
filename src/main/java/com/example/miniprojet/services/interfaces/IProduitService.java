package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> findAll();
    Produit findById(Long Id);
    List<Produit> findByCooperative_Id(Long Id);
    List<Produit> findByCategorie_Id(Long Id);
    Produit save(Produit produit);
    void deleteById(Long Id);
    Produit updateProduct(Produit produit, Long Id);
    Produit updateProductCat(Long productId, Long categorieId);
}
