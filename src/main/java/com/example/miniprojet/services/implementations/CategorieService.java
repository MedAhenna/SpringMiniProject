package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Categorie;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.CategorieRepository;
import com.example.miniprojet.services.interfaces.ICategorieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements ICategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<Categorie> findAll(){
        return  categorieRepository.findAll();
    }

    @Override
    public Categorie findById(Long Id) {
        return categorieRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Categorie","Id",Id)
        );
    }

    @Override
    public Categorie save(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteById(Long Id) {
        categorieRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Categorie","Id",Id)
        );
        categorieRepository.deleteById(Id);
    }
}
