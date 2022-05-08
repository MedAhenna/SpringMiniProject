package com.example.miniprojet.services;

import com.example.miniprojet.entities.Produit;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService implements IProduitService{

    ProduitRepository produitRepository;

    @Autowired
    public  ProduitService(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> findAll(){
        return produitRepository.findAll();
    }

    @Override
    public Produit findById(Long Id) {
        return produitRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Produit","Id",Id));
    }

    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteById() {

    }

    @Override
    public Produit updateProduit(Long Id) {
        return null;
    }
}
