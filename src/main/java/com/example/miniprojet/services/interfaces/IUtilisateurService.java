package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    Utilisateur save(Utilisateur user);
    List<Utilisateur> findAll();
    Utilisateur findById(Long Id);
    void deleteById(Long Id);
    Utilisateur updateUser(Utilisateur user, Long Id);
}
