package com.example.miniprojet.services.interfaces;

import com.example.miniprojet.entities.Utilisateur;

public interface IuserDetailsService {
    Utilisateur loadUserByUsername(String username);
}
