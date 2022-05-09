package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Categorie;

import java.util.List;

public interface ICategorieService {
    List<Categorie> findAll();
    Categorie findById(Long Id);
    Categorie save(Categorie categorie);
    void deleteById(Long Id);
}
