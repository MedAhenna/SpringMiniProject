package com.example.miniprojet.services.implementations;

import com.example.miniprojet.entities.Produit;
import com.example.miniprojet.exceptions.ResourceNotFoundException;
import com.example.miniprojet.repositories.CategorieRepository;
import com.example.miniprojet.repositories.ProduitRepository;
import com.example.miniprojet.services.interfaces.IProduitService;
import com.example.miniprojet.utils.isNullOrEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements IProduitService {

    ProduitRepository produitRepository;
    CategorieRepository categorieRepository;

    @Autowired
    public  ProduitService(ProduitRepository produitRepository, CategorieRepository categorieRepository){
        this.produitRepository = produitRepository;
        this.categorieRepository = categorieRepository;
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
    public void deleteById(Long Id) {
        produitRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Produit","Id",Id));
        produitRepository.deleteById(Id);
    }

    @Override
    public Produit updateProduct(Produit produit, Long Id) {
        Produit existProduct = produitRepository.findById(Id).orElseThrow(
                ()-> new ResourceNotFoundException("Product","Id",Id)
        );
        existProduct.setNom(isNullOrEmpty.check(produit.getNom()) ? produit.getNom() : existProduct.getNom());
        existProduct.setDescription(isNullOrEmpty.check(produit.getDescription()) ? produit.getDescription() : existProduct.getDescription());
        existProduct.setMin_order(isNullOrEmpty.check(produit.getMin_order()) ? produit.getMin_order() : existProduct.getMin_order());
        existProduct.setQty_dispo(isNullOrEmpty.check(produit.getQty_dispo()) ? produit.getQty_dispo() : existProduct.getQty_dispo());

        produitRepository.save(existProduct);
        return existProduct;
    }
}
