package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Role;
import com.example.miniprojet.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    Utilisateur saveUser(Utilisateur user);
    Role saveRole(Role role);
    Role getRole(Long Id);
    Utilisateur addRoleToUser(Long userId, Long roleId);
    List<Utilisateur> findAll();
    Utilisateur findById(Long Id);
    void deleteById(Long Id);
    Utilisateur updateUser(Utilisateur user, Long Id);
}
