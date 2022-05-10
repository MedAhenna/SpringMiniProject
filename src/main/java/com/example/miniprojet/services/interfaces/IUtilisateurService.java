package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Role;
import com.example.miniprojet.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    Utilisateur saveUser(Utilisateur user);
    Role saveRole(Role role);
    Utilisateur addRoleToUser(String username, String roleName);
    List<Utilisateur> findAll();
    Utilisateur findById(Long Id);
    void deleteById(Long Id);
    Utilisateur updateUser(Utilisateur user, Long Id);
}
