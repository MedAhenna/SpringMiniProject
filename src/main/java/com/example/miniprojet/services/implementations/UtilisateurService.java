package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Utilisateur;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.UtilisateurRepository;
import com.example.miniprojet.services.interfaces.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService implements IUtilisateurService {


    UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur save(Utilisateur user) {
        return utilisateurRepository.save(user);
    }

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur findById(Long Id) {
        return utilisateurRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Utilisateur","Id",Id)
        );
    }

    @Override
    public void deleteById(Long Id) {
        utilisateurRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Utilisateur","Id",Id)
        );
        utilisateurRepository.deleteById(Id);
    }

    @Override
    public Utilisateur updateUser(Utilisateur user, Long Id) {
        return null;
    }
}
