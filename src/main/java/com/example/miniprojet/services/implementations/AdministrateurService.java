package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Administrateur;
import com.example.miniprojet.repositories.AdministrateurRepository;
import com.example.miniprojet.services.interfaces.IAdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrateurService implements IAdminService {

    private final AdministrateurRepository administrateurRepository;

    public AdministrateurService(AdministrateurRepository administrateurRepository) {
        this.administrateurRepository = administrateurRepository;
    }

    @Override
    public Administrateur save(Administrateur admin) {
        return administrateurRepository.save(admin);
    }

    @Override
    public List<Administrateur> findAll() {
        return null;
    }

    @Override
    public Administrateur getById(Long Id) {
        return null;
    }
}
