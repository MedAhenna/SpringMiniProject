package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.MatierePremiere;

import java.util.List;

public interface IMatierePremiereService {
    List<MatierePremiere> findAll();
    MatierePremiere findById(Long Id);
    MatierePremiere save(MatierePremiere matierePremiere);
    void deleteById(Long Id);
}
